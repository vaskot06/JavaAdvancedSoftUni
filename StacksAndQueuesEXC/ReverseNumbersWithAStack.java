package StacksAndQueuesEXC;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");
        ArrayDeque<String> toPrint = new ArrayDeque<>();

        for (String number : numbers) {
            toPrint.push(number);
        }
        while (!toPrint.isEmpty()) {
            System.out.print(toPrint.pop()+ " ");
        }
    }
}
