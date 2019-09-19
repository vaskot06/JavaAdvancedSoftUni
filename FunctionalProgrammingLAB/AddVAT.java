package FunctionalProgrammingLAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AddVAT {
    public static void main(String[] args) throws IOException {

        System.out.println("Prices with VAT:");

        Arrays.stream(new BufferedReader(new InputStreamReader(System.in))
                .readLine().split(", ")).mapToDouble(Double::parseDouble)
                .forEach(x-> System.out.printf("%.2f%n",x + (x * 0.20)));

    }
}
