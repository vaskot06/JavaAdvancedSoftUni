package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> children = new ArrayDeque<>();

        for (String name : names) {
            children.offer(name);
        }

        while (children.size() > 1) {
            for (int i = 1; i < n; i++) {
                children.offer(children.poll());
            }
            System.out.println("Removed " + children.poll());

        }
        System.out.println("Last is " + children.peek());
    }
}
