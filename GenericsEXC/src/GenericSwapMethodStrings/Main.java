package GenericSwapMethodStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> list = new ArrayList<>();
        Box<Integer> box = new Box<>(list);

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            box.add(Integer.parseInt(line));
        }

        String[] secondLine = scanner.nextLine().split(" ");

        box.swap(list, Integer.parseInt(secondLine[0]), Integer.parseInt(secondLine[1]));
        System.out.println(box);
    }
}
