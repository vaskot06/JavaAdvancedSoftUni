package MultidimensionalArraysLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            matrix[i] = input;
        }


        for (int row = 0; row < size; row++) {
            System.out.print(matrix[row][row] + " ");
        }
        int counter = 0;
        System.out.println();
        for (int row = size; row > 0; row--) {
            System.out.print(matrix[row - 1][counter] + " ");
            counter++;
        }
    }
}
