package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        ArrayDeque<String> printer = new ArrayDeque<>();

        while (!line.equals("print")) {

            if (!line.equals("cancel")) {
                printer.offer(line);
            } else if (line.equals("cancel")) {
                if (printer.isEmpty()) {
                    System.out.println("Printer is on standby");
                    line = scanner.nextLine();
                    continue;
                }
                String current = printer.peek();
                System.out.println("Canceled " + current);
                printer.poll();
            }

            line=scanner.nextLine();
        }

        while (!printer.isEmpty()) {
            System.out.println(printer.poll());
        }
    }
}
