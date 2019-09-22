package SetsAndMapsEXC;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashSet<String> names = new LinkedHashSet<>();


        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            names.add(name);
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
