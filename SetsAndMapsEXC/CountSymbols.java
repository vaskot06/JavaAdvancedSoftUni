package SetsAndMapsEXC;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character, Integer> symbolByCount = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            if (!symbolByCount.containsKey(symbol)) {
                symbolByCount.put(symbol, 1);
            }else {
                symbolByCount.put(symbol, symbolByCount.get(symbol) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : symbolByCount.entrySet()) {
            char symbol = entry.getKey();
            int counter = entry.getValue();

            System.out.printf("%c: %d time/s\n", symbol, counter);
        }
    }
}
