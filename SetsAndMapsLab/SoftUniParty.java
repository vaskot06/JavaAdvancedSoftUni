package SetsAndMapsLab;

import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeSet<String> guests = new TreeSet<>();

        String input = scanner.nextLine();

        while (!input.equals("PARTY")) {
            guests.add(input);
            input = scanner.nextLine();
        }

        String inputTwo = scanner.nextLine();

        while (!inputTwo.equals("END")) {
            guests.remove(inputTwo);
            inputTwo = scanner.nextLine();
        }

        System.out.println(guests.size());

        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
