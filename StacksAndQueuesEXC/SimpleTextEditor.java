package StacksAndQueuesEXC;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int operations = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> queue = new ArrayDeque<>();
        ArrayDeque<String> queueToKeep = new ArrayDeque<>();


        for (int i = 0; i < operations; i++) {
            String text = "";
            String[] tokens = scanner.nextLine().split(" ");
            String command = tokens[0];

            if (command.equals("1")) {
                text = text.concat(tokens[1]);
                if (!queue.isEmpty()) {
                    queue.pop();

                }
                queue.push(text);
                queueToKeep.push(text);
                text = queue.peek();
            } else if (command.equals("2")) {
                int countToErase = Integer.parseInt(tokens[1]);
                StringBuilder builder = new StringBuilder();
                builder.append(text);
                int beginIndex = text.length() - countToErase;
                if (countToErase > text.length()) {
                    continue;
                }
                builder.delete(beginIndex, text.length());
                text= String.valueOf(builder);
                queue.clear();
                queue.push(text);
                queueToKeep.push(text);

            } else if (command.equals("3")) {
                if (queue.isEmpty()) {
                    continue;
                }
                int index = Integer.parseInt(tokens[1]);
                text = queue.peek();
                System.out.println(text.charAt(index - 1));
            } else {
                queueToKeep.pop();
                queue = queueToKeep.clone();
            }
        }

    }
}
