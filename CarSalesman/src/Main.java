import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int engineLines = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<Engine, LinkedHashSet<Car>> engineByCar = new LinkedHashMap<>();
        List<Engine> engines = new ArrayList<>();


        for (int i = 0; i < engineLines; i++) {
            String[] tokens = scanner.nextLine().split(" ");

            String model = tokens[0];
            String power = tokens[1];
            String displacement = "";
            String efficiency = "";
            Engine engine = new Engine(model, power);
            if (tokens.length == 3) {
                if (Character.isDigit(tokens[2].charAt(0))) {
                    displacement = tokens[2];
                    engine.setDisplacement(displacement);
                } else {
                    efficiency = tokens[2];
                    engine.setEfficiency(efficiency);
                }
            } else if (tokens.length == 4) {
                displacement = tokens[2];
                efficiency = tokens[3];
                engine.setDisplacement(displacement);
                engine.setEfficiency(efficiency);
            }

            engineByCar.putIfAbsent(engine, new LinkedHashSet<>());

            //engines.add(engine);

        }

        int m = Integer.parseInt(scanner.nextLine());
        List<String> carsToCheck = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String[] tokens = scanner.nextLine().split(" ");

            String model = tokens[0];
            String engine = tokens[1];
            String weight = "";
            String color = "";
            carsToCheck.add(model);
            Car car = new Car(model, engine);

            if (tokens.length == 3) {
                if (Character.isDigit(tokens[2].charAt(0))) {
                    weight = tokens[2];
                    car.setWeight(weight);
                } else {
                    color = tokens[2];
                    car.setColor(color);
                }
            } else if (tokens.length == 4) {
                weight = tokens[2];
                color = tokens[3];
                car.setWeight(weight);
                car.setColor(color);
            }

            for (Map.Entry<Engine, LinkedHashSet<Car>> entry : engineByCar.entrySet()) {
                Engine engine1 = entry.getKey();
                LinkedHashSet<Car> cars = entry.getValue();
                if (engine1.getModel().equals(engine)) {
                    cars.add(car);
                    engineByCar.put(engine1, cars);
                }
            }
        }

        engineByCar.entrySet().stream().sorted();

        for (Map.Entry<Engine, LinkedHashSet<Car>> entry : engineByCar.entrySet()) {
            Engine engine = entry.getKey();
            LinkedHashSet<Car> cars = entry.getValue();


            for (String carToCheck : carsToCheck) {
                for (Car car : cars) {
                    if (car.getModel().equals(carToCheck)) {
                        if (car.getEngine().equals(engine.getModel())) {
                            System.out.printf("%s:%n%s:%nPower: %s%nDisplacement: %s%nEfficiency: %s%nWeight: %s%nColor: %s%n", car.getModel(),
                                    car.getEngine(),
                                    engine.getPower(),
                                    engine.getDisplacement(),
                                    engine.getEfficiency(),
                                    car.getWeight(),
                                    car.getColor());
                        }

                    }
                }
            }
//            FordFocus:
//            V4-33:
//            Power: 140
//            Displacement: 28
//            Efficiency: B
//            Weight: 1300
//            Color: Silver


        }

    }
}
