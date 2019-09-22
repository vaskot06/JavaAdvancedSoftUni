package SetsAndMapsLab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<Double, Integer> occurrences = new LinkedHashMap<>();

        double[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        for (int i = 0; i < input.length; i++) {
            if (!occurrences.containsKey(input[i])) {
                occurrences.put(input[i], 1);
            }else {
                occurrences.put(input[i], occurrences.get(input[i]) + 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : occurrences.entrySet()) {
            double number = entry.getKey();
            int occurrence = entry.getValue();

            System.out.printf("%.1f -> %d%n", number, occurrence);
        }
    }
}
