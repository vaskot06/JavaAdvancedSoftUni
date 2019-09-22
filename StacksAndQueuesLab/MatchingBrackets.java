package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String expressions = scanner.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i <expressions.length() ; i++) {
            if (expressions.charAt(i) == '(') {
                stack.push(i);
            } else if (expressions.charAt(i) == ')') {
                int startIndex = stack.pop();
                String contents = expressions.substring(startIndex, i + 1);
                System.out.println(contents);
            }
        }
    }
}
