package SetsAndMapsLab;

import java.util.HashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        HashSet<String> parkingLot = new HashSet<>();

        while (!input.equals("END")) {
            String[] tokens = input.split(", ");

            if (tokens[0].equals("IN")) {
                parkingLot.add(tokens[1]);
            }else {
                parkingLot.remove(tokens[1]);
            }

            input = scanner.nextLine();
        }

        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
            return;
        }

        for (String s : parkingLot) {
            System.out.println(s);
        }
    }
}
