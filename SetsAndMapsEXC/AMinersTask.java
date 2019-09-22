package SetsAndMapsEXC;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinersTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> map = new LinkedHashMap<>();

        while (true) {
            String resourses = scanner.nextLine();

            if (resourses.equals("stop")) {
                break;
            }

            int quantity = Integer.parseInt(scanner.nextLine());

            if (!map.containsKey(resourses)) {
                map.put(resourses, quantity);
            }else {
                map.put(resourses, map.get(resourses) + quantity);
            }


        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}
