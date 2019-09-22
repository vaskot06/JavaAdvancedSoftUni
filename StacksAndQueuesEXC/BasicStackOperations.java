package StacksAndQueuesEXC;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);
        int smallestNumber = Integer.MAX_VALUE;

        String[] numbersInput = scanner.nextLine().split(" ");

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            numbers.push(Integer.parseInt(numbersInput[i]));
        }

        for (int i = 0; i < s; i++) {
            numbers.pop();
        }
        if (numbers.contains(x)) {
            System.out.println("true");
        }else {
            if (numbers.isEmpty()) {
                System.out.println(0);
                return;
            }
            while (!numbers.isEmpty()) {
                if (smallestNumber > numbers.peek()) {
                    smallestNumber = numbers.peek();
                }
                numbers.pop();
            }
            System.out.println(smallestNumber);
        }
    }
}
