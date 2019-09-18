import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            if (input.length == 1) {

                Car car = new Car(input[0]);

                car.setMake(input[0]);
                car.getInfo();
            }else if (input.length >= 2){
                Car car = new Car(input[0], input[1], Integer.parseInt(input[2]));

                car.setMake(input[0]);
                car.setModel(input[1]);
                car.setHorsePower(Integer.parseInt(input[2]));
                car.getInfo();
            }

        }
    }

}
