package StacksAndQueuesEXC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class testets {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(buffer.readLine());

        String[] plants = buffer.readLine().split(" ");

        ArrayDeque<Integer> indexes = new ArrayDeque<>();
        indexes.push(0);

        int[] days = new int[n];

        for (int i = 0; i < n; i++) {

            int maxDays = 0;

            while (indexes.size() > 0 && Integer.valueOf(plants[indexes.peek()]) >= Integer.valueOf(plants[i])) {
                maxDays = Math.max(maxDays, days[indexes.pop()]);
            }

            if (indexes.size() > 0) {
                days[i] = maxDays + 1;
            }

            indexes.push(i);
        }
        System.out.println(max(days));
    }

    private static int max(int[] days) {
        int max = Integer.MIN_VALUE;
        for (int day : days) {
            if (day > max) {
                max = day;
            }
        }
        return max;
    }
}