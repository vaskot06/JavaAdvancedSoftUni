package StacksAndQueuesEXC;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        ArrayDeque<Integer> numbersForMaxElement = new ArrayDeque<>();


        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            int biggestNumber = Integer.MIN_VALUE;
            numbersForMaxElement = numbers.clone();
            int command = Integer.parseInt(tokens[0]);

            if (command == 1) {
                int element = Integer.parseInt(tokens[1]);
                numbers.push(element);
            } else if (command == 2) {
                numbers.pop();
            } else if (command == 3) {
                if (numbersForMaxElement.isEmpty()) {
                    continue;
                }
                while (!numbersForMaxElement.isEmpty()) {
                    if (biggestNumber < numbersForMaxElement.peek()) {
                        biggestNumber = numbersForMaxElement.peek();
                    }
                    numbersForMaxElement.pop();
                }
                System.out.println(biggestNumber);
            }

        }
    }
}
