package GenericCountMethodStrings;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Double> list = new ArrayList<>();
        Box<Double> box = new Box<>(list);

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            box.add(Double.parseDouble(line));
        }
        String line = scanner.nextLine();

        System.out.println(box.compare(list, Double.parseDouble(line)));


    }
}
