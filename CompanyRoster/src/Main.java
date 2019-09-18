import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        HashMap<String, Departament> map = new HashMap<>();


        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String department = tokens[3];


            Employee employee = new Employee(name, salary, position);

            if (tokens.length == 5) {
                if (Character.isDigit(tokens[4].charAt(0))) {
                    int age = Integer.parseInt(tokens[4]);
                    employee.setAge(age);
                } else {
                    String email = tokens[4];
                    employee.setEmail(email);
                }
            } else if (tokens.length == 6) {
                String email = tokens[4];
                int age = Integer.parseInt(tokens[5]);
                employee.setEmail(email);
                employee.setAge(age);
            }

            List<Employee> departamentList = new ArrayList<>();
            departamentList.add(employee);
            if (!map.containsKey(department)) {
                Departament departaments = new Departament(departamentList);
                map.put(department, departaments);
            } else {
                Departament departaments = map.get(department);
                departaments.getEmployees().add(employee);
                map.put(department, departaments);
            }

        }

        Map<String, Departament> bestMap = new HashMap<>();
        String bestDepartment = "";
        double bestAvg = 0;
        for (Map.Entry<String, Departament> entry : map.entrySet()) {
            String department = entry.getKey();
            Departament departaments = entry.getValue();
            for (int i = 0; i < departaments.getSize(); i++) {
                double average = departaments.getEmployees().stream().mapToDouble(Employee::getSalary).average().getAsDouble();
                if (average > bestAvg) {
                    bestAvg = average;
                    bestDepartment = department;
                }
            }
        }

        for (Map.Entry<String, Departament> entry : map.entrySet()) {
            String department = entry.getKey();
            Departament departaments = entry.getValue();
            if (bestDepartment.equals(department)) {
                bestMap.put(department, departaments);
            }
        }


        System.out.println("Highest Average Salary: " + bestDepartment);


        for (Map.Entry<String, Departament> entry : bestMap.entrySet()) {
            entry.getValue().getEmployees()
                    .stream()
                    .sorted((f,s)->Double.compare(s.getSalary(), f.getSalary()))
                    .forEach(e-> System.out.printf("%s %.2f %s %d%n", e.getName(), e.getSalary(), e.getEmail(), e.getAge()));
        }
    }
}


