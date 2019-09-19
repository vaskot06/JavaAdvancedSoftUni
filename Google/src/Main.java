import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        LinkedHashMap<String, List<Pokemon>> nameByPokemon = new LinkedHashMap<>();
        LinkedHashMap<String, List<Parents>> nameByParents = new LinkedHashMap<>();
        LinkedHashMap<String, List<Children>> nameByCildren = new LinkedHashMap<>();
        LinkedHashMap<String, Person> nameByPerson = new LinkedHashMap<>();


        while (!line.equals("End")) {
            String[] tokens = line.split(" ");
            String name = tokens[0];
            String checker = tokens[1];

            if (!nameByPerson.containsKey(name)) {
                Person person = new Person(name, new Company(), new ArrayList<Pokemon>(),
                        new ArrayList<Parents>(), new ArrayList<Children>(), new Car());
                nameByPerson.put(name, person);
            }


            if (checker.equals("company")) {

                String companyName = tokens[2];
                String department = tokens[3];
                double salary = Double.parseDouble(tokens[4]);

                Company company = new Company(companyName, department, salary);
                nameByPerson.get(name).setCompany(company);


            } else if (checker.equals("pokemon")) {

                String pokemonName = tokens[2];
                String pokemonType = tokens[3];

                Pokemon pokemon = new Pokemon(pokemonName, pokemonType);
                if (!nameByPokemon.containsKey(name)) {
                    List<Pokemon> pokemons = new ArrayList<>();
                    pokemons.add(pokemon);
                    nameByPokemon.put(name, pokemons);
                } else {
                    nameByPokemon.get(name).add(pokemon);
                }

                nameByPerson.get(name).setPokemon(nameByPokemon.get(name));

            } else if (checker.equals("parents")) {

                String parentName = tokens[2];
                String parentBday = tokens[3];

                Parents parent = new Parents(parentName, parentBday);

                if (!nameByParents.containsKey(name)) {
                    List<Parents> parents = new ArrayList<>();
                    parents.add(parent);
                    nameByParents.put(name, parents);
                } else {
                    nameByParents.get(name).add(parent);
                }

                nameByPerson.get(name).setParents(nameByParents.get(name));


            } else if (checker.equals("children")) {


                String childName = tokens[2];
                String childBday = tokens[3];

                Children child = new Children(childName, childBday);

                if (!nameByCildren.containsKey(name)) {
                    List<Children> children = new ArrayList<>();
                    children.add(child);
                    nameByCildren.putIfAbsent(name, children);
                } else {
                    nameByCildren.get(name).add(child);
                }

                nameByPerson.get(name).setChildren(nameByCildren.get(name));


            } else if (checker.equals("car")) {

                String carModel = tokens[2];
                String carSpeed = tokens[3];
                Car car = new Car(carModel, carSpeed);
                nameByPerson.get(name).setCar(car);

            }

            ;
            line = scanner.nextLine();
        }

        String checker = scanner.nextLine();

        for (Map.Entry<String, Person> entry : nameByPerson.entrySet()) {
            String name = entry.getKey();
            Person person = entry.getValue();

            if (name.equals(checker)) {
                System.out.println(name);
                System.out.println("Company: ");
                if (person.getCompany().getCompanyName().equals("")) {

                }else {
                    System.out.printf("%s ", person.getCompany().getCompanyName());
                }
                if (person.getCompany().getDepartment().equals("")) {

                }else {
                    System.out.printf("%s ", person.getCompany().getDepartment());
                }
                if (person.getCompany().getSalary() == 0) {

                }else {
                    System.out.printf("%.2f%n", person.getCompany().getSalary());
                }

                System.out.println("Car: ");
                if (person.getCar().getCarModel().equals("")) {

                }else {
                    System.out.printf("%s ", person.getCar().getCarModel());
                }
                if (person.getCar().getCarSpeed().equals("")) {

                }else {
                    System.out.printf("%s%n", person.getCar().getCarSpeed());
                }

                List<Pokemon> pokemons = person.getPokemon();
                System.out.println("Pokemon: ");
                for (Pokemon pokemon : pokemons) {
                    System.out.println(pokemon.getPokemonName() + " " + pokemon.getPokemonType());
                }

                List<Parents> parents= person.getParents();
                System.out.println("Parents: ");
                for (Parents parent : parents) {
                    System.out.println(parent.getParentNames() + " " + parent.getParentBirthday());
                }

                List<Children> children = person.getChildren();
                System.out.println("Children: ");
                for (Children child : children) {
                    System.out.println(child.getChildName()+ " " + child.getChildBirthday());
                }


            }
        }
    }
}
