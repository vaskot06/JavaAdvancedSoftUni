package StacksAndQueuesEXC;

import java.sql.Time;
import java.time.Instant;
import java.util.*;

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] robots = scanner.nextLine().split(";");
        String time = scanner.nextLine();
        String item = scanner.nextLine();
        Map<String, Integer> robotsInMap = new LinkedHashMap<>();
        ArrayDeque<String> tasks = new ArrayDeque<>();

        for (int i = 0; i < robots.length; i++) {
            String[] tokens = robots[i].split("-");
            String robot = tokens[0];
            int processTime = Integer.parseInt(tokens[1]);
            robotsInMap.putIfAbsent(robot, processTime);
        }

        while (!item.equals("End")) {
            tasks.offer(item);
            item = scanner.nextLine();
        }

        for (int i = 0; i < robots.length; i++) {
            String[] tokens = robots[i].split("-");
            String robot = tokens[0];
            int processTime = Integer.parseInt(tokens[1]);
            String[] timeTokens = time.split(":");
            int hours = Integer.parseInt(timeTokens[0]);
            int mins = Integer.parseInt(timeTokens[1]);
            int seconds = Integer.parseInt(timeTokens[2]);
            System.out.println(robot + " " + (seconds + 1) + " " + tasks.pop());
        }

    }
}
