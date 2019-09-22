package SetsAndMapsEXC;

import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String name = scanner.nextLine();


            if (name.equals("stop")) {
                break;
            }
            String email = scanner.nextLine();
            String[] checker = email.split("\\.");
            if (checker[1].equals("us") || checker[1].equals("uk") || checker[1].equals("com")) {
                continue;
            }

            System.out.printf("%s -> %s\n", name,email);
        }
    }
}
