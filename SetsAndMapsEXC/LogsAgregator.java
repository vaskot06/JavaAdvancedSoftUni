package SetsAndMapsEXC;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LogsAgregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        TreeMap<String, TreeMap<String, Integer>> logAgregator = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String ip = tokens[0];
            String username = tokens[1];
            int duration = Integer.parseInt(tokens[2]);

            if (!logAgregator.containsKey(username)) {
                TreeMap<String, Integer> ipByDuration = new TreeMap<>();
                if (!ipByDuration.containsKey(ip)) {
                    ipByDuration.put(ip, duration);
                } else {
                    ipByDuration.put(ip, ipByDuration.get(ip) + duration);
                }
                logAgregator.put(username, ipByDuration);
            } else {
                TreeMap<String, Integer> ipByDuration = logAgregator.get(username);
                if (!ipByDuration.containsKey(ip)) {
                    ipByDuration.put(ip, duration);
                } else {
                    ipByDuration.put(ip, ipByDuration.get(ip) + duration);
                }
                logAgregator.put(username, ipByDuration);
            }
        }
        for (Map.Entry<String, TreeMap<String, Integer>> entry : logAgregator.entrySet()) {
            String username = entry.getKey();
            System.out.print(username + ": ");
            TreeMap<String, Integer> ipByDuration = entry.getValue();

            int totalDuration = 0;

            for (Integer value : ipByDuration.values()) {
                totalDuration += value;
            }
            int size = ipByDuration.size() - 1;

            System.out.print(totalDuration + " [");

            for (Map.Entry<String, Integer> integerEntry : ipByDuration.entrySet()) {
                String ip = integerEntry.getKey();

                if (size > 0) {
                    System.out.print(ip + ", ");
                } else if (size == 0) {
                    System.out.println(ip + "]");
                }

                size--;
            }

        }
    }
}
