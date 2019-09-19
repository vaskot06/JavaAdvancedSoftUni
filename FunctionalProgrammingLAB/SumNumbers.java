package FunctionalProgrammingLAB;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) throws IOException {

       int[] numbers = Arrays.stream(new BufferedReader(new InputStreamReader(System.in)).readLine().split(", "))
               .mapToInt(Integer::parseInt).toArray();

        int sum = Arrays.stream(numbers).sum();

        System.out.printf("Count = %d%nSum = %d", numbers.length, sum);
    }
}
