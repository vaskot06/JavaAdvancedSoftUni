package DefiningClasses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Car car = new Car();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            car.setMake(input[0]);
            car.setModel(input[1]);
            car.setHorsePower(Integer.parseInt(input[2]));

            car.getInfo();
        }
    }

}
