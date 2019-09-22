package StacksAndQueuesEXC;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParantheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expressions = scanner.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        boolean isTrue = false;

        for (int i = 0; i < expressions.length(); i++) {

            isTrue = false;
            if (expressions.charAt(i) == '{' || expressions.charAt(i) == '(' || expressions.charAt(i) == '[') {
                stack.push(i);
            } else if (expressions.charAt(i) == '}' || expressions.charAt(i) == ')' || expressions.charAt(i) == ']') {
                if (stack.isEmpty()) {
                    System.out.println("NO");
                    return;
                }
                int startIndex = stack.pop();

                if (expressions.charAt(startIndex) == '(' && expressions.charAt(i) == ')') {
                    isTrue = true;
                }if (expressions.charAt(startIndex) == '{' && expressions.charAt(i) == '}') {
                    isTrue = true;
                }if (expressions.charAt(startIndex) == '[' && expressions.charAt(i) == ']') {
                    isTrue = true;
                }

                if (isTrue == false){
                    System.out.println("NO");
                    return;
                }
            }
        }

        if (isTrue == true) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
