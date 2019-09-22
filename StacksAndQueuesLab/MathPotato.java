package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());


        ArrayDeque<String> children = new ArrayDeque<>();

        for (String name : names) {
            children.offer(name);
        }


        int counter = 1;
        while (children.size() > 1) {
            for (int i = 1; i < n; i++) {
                children.offer(children.poll());
            }
            if (isPrime(counter) || counter == 1) {
                System.out.println("Removed " + children.poll());
            }else {
                System.out.println("Prime " + children.peek());
            }

            counter++;
        }
        System.out.println("Last is " + children.peek());
    }

    private static boolean isPrime(int number){
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }
}
