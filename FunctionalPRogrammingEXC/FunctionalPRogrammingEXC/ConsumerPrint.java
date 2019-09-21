package FunctionalPRogrammingEXC;

import java.util.Arrays;
import java.util.Scanner;

public class ConsumerPrint {
    public static void main(String[] args) {

        Arrays.stream(new Scanner(System.in).nextLine().split(" "))
                .forEach(System.out::println);

    }
}
