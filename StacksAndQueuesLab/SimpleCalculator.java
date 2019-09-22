package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<String> numbers = new ArrayDeque<>();
        Collections.addAll(numbers, input);
        int result = 0;

        while (numbers.size() > 1) {
            int first = Integer.parseInt(numbers.pop());
            String operator = numbers.pop();
            int second = Integer.parseInt(numbers.pop());

            if (operator.equals("+")) {
                numbers.push(String.valueOf(first + second));
            } else {
                numbers.push(String.valueOf(first - second));
            }
        }
        System.out.println(numbers.peek());
    }
}
