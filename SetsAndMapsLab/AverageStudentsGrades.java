package SetsAndMapsLab;

import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        TreeMap<String, ArrayList<Double>> studentsByGrades = new TreeMap<>();


        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);

            ArrayList<Double> grades = new ArrayList<>();
            grades.add(grade);

            if (!studentsByGrades.containsKey(name)) {
                studentsByGrades.put(name, grades);
            }else {
                studentsByGrades.get(name).add(grade);
            }
        }

        for (Map.Entry<String, ArrayList<Double>> entry : studentsByGrades.entrySet()) {
            String name = entry.getKey();
            List<Double> grades = entry.getValue();
            System.out.print(name + " -> ");
            double sum = 0;
            for (Double grade : grades) {
                System.out.printf("%.2f ", grade);
                sum+=grade;
            }
            double avg = sum / grades.size();
            System.out.printf("(avg: %.2f)", avg);
            System.out.println();
        }
    }
}
