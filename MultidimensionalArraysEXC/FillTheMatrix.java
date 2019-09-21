package MultidimensionalArraysEXC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = new int[size][size];

        if (pattern.equals("A")) {
            firstPattern(matrix);
            for (int col = 0; col < size; col++) {
                for (int row = 0; row < size; row++) {
                    System.out.print(matrix[row][col] + " ");
                }
                System.out.println();
            }
        } else {
            secondPattern(matrix);
            for (int col = 0; col < size; col++) {
                for (int row = 0; row < size; row++) {
                    System.out.print(matrix[row][col] + " ");
                }
                System.out.println();
            }
        }


    }

    private static void secondPattern(int[][] matrix) {
        int number = 1;

        for (int col = 0; col < matrix.length; col++) {

            if (col % 2 == 0) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[col][row] = number++;
                }
            } else {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[col][row] = number++;
                }
            }


        }
    }

    private static void firstPattern(int[][] matrix) {
        int number = 1;

        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[col][row] = number++;
            }
        }
    }
}
