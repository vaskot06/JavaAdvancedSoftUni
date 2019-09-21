package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            int[] inputArray = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

            matrix[i] = inputArray;
        }

        int bestSum = Integer.MIN_VALUE;

        int first = 0;
        int second = 0;
        int third = 0;
        int fourth = 0;

        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {

                int firstSum = matrix[row][col] + matrix[row][col + 1];
                int secondSum = matrix[row + 1][col] + matrix[row + 1][col + 1];
                int totalSum = firstSum + secondSum;

                if (totalSum > bestSum) {
                    first = matrix[row][col];
                    second = matrix[row][col + 1];
                    third = matrix[row + 1][col];
                    fourth = matrix[row + 1][col + 1];
                    bestSum = totalSum;
                }
            }
        }
        System.out.printf("%d %d%n%d %d%n", first, second, third, fourth);
        System.out.println(bestSum);
    }
}
