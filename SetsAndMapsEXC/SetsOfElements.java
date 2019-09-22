package SetsAndMapsEXC;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] numbers = scanner.nextLine().split(" ");
        int first = Integer.parseInt(numbers[0]);
        int second = Integer.parseInt(numbers[1]);

        int sum = first + second;

        LinkedHashSet<Integer> setFirst = new LinkedHashSet<>(first);
        LinkedHashSet<Integer> setSecond = new LinkedHashSet<>(second);
        LinkedHashSet<Integer> setToPrint = new LinkedHashSet<>();



        for (int i = 0; i < sum; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (!setFirst.contains(number)) {
                setFirst.add(number);
            }else {
                setSecond.add(number);
            }
        }

        for (Integer integer : setFirst) {
            for (Integer integer1 : setSecond) {
                if (integer.equals(integer1)) {
                    setToPrint.add(integer);
                }
            }
        }

        for (Integer integer : setToPrint) {
            System.out.print(integer + " ");
        }
    }
}
