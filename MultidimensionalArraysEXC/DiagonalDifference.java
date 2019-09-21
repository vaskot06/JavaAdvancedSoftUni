package MultidimensionalArraysEXC;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];


        for (int i = 0; i < size; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        sumOfFirstDiagonal(matrix);
        sumOfSecondDiagonal(matrix);

        System.out.println(Math.abs(sumOfFirstDiagonal(matrix) - sumOfSecondDiagonal(matrix)));


    }

    private static int sumOfSecondDiagonal(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][matrix.length - i - 1];
        }

        return sum;
    }

    private static int sumOfFirstDiagonal(int[][] matrix) {
        int sum = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {

                if (row == col) {
                    sum += matrix[row][col];
                }

            }
        }
        return sum;
    }
}
