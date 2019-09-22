package StacksAndQueuesEXC;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);
        int smallestNumber = Integer.MAX_VALUE;

        Deque<Integer> numbers = new ArrayDeque<>();

        String[] numbersSecondLine = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            numbers.offer(Integer.parseInt(numbersSecondLine[i]));
        }

        for (int i = 0; i < s; i++) {
            numbers.poll();
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
