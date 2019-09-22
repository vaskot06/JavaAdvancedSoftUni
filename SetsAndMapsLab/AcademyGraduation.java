package SetsAndMapsLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Double> studentAndGrade = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble)
                    .average().stream().toArray();

            double grade = 0;

            for (double gradeInArray : grades) {
                grade = gradeInArray;
            }

            studentAndGrade.putIfAbsent(name,grade);

        }
        for (Map.Entry<String, Double> stringDoubleEntry : studentAndGrade.entrySet()) {
            String name = stringDoubleEntry.getKey();
            Double grade = stringDoubleEntry.getValue();
            DecimalFormat decimalFormat = new DecimalFormat("#.##########################");



            System.out.printf("%s is graduated with %s%n", name, decimalFormat.format(grade));
        }
    }
}
