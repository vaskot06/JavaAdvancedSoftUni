package SetsAndMapsEXC;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogsV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        TreeMap<String, LinkedHashMap<String, Integer>> userByIP = new TreeMap<>();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");

            String ip = tokens[0];
            ip = ip.replaceAll("IP=", "");
            String user = tokens[2];
            user = user.substring(user.lastIndexOf("=") + 1);

            if (!userByIP.containsKey(user)) {
                LinkedHashMap<String,Integer> ipByCount = new LinkedHashMap<>();
                ipByCount.put(ip, 1);
                userByIP.put(user, ipByCount);
            }else {
                LinkedHashMap<String, Integer> ipByCount = userByIP.get(user);

                if (ipByCount.containsKey(ip)) {
                    ipByCount.put(ip, ipByCount.get(ip) + 1);
                }else {
                    ipByCount.put(ip, 1);
                }
                userByIP.put(user, ipByCount);

            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : userByIP.entrySet()) {
            String user = entry.getKey();
            LinkedHashMap<String, Integer> ipByCount = entry.getValue();
            System.out.println(user + ":");

            int counter = ipByCount.size() - 1;
            for (Map.Entry<String, Integer> ips : ipByCount.entrySet()) {
                String ip = ips.getKey();
                int count = ips.getValue();

                if (counter == 0) {
                    System.out.printf("%s => %d.\n", ip, count);
                }else {
                    System.out.printf("%s => %d, ", ip, count);
                }

                counter--;
            }
        }
    }
}
