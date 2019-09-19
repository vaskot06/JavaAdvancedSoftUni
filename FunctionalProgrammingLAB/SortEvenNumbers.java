package FunctionalProgrammingLAB;

import java.util.Arrays;
import java.util.Scanner;

public class SortEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).filter(n -> n % 2 == 0)
                .toArray();
        toPrint(numbers);
        int[] ints = Arrays.stream(numbers).sorted().toArray();
        toPrint(ints);
    }

    private static void toPrint(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (i == ints.length - 1) {
                System.out.println(ints[i]);
            } else {
                System.out.print(ints[i] + ", ");
            }
        }

    }
}
