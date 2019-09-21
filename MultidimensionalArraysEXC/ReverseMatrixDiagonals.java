package MultidimensionalArraysEXC;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            int[] number = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            matrix[i] = number;
        }

        int row = rows - 1;
        int col = cols - 1;

        while (row >= 0) {

            int r = row;
            int c = col;

            while (c < cols && r >= 0) {

                System.out.print(matrix[r--][c++] + " ");
            }
            System.out.println();
            col--;

            if (col < 0) {
                col = 0;
                row--;
            }

        }


    }
}
//
//        for( int row = 0 ; row < dimensions[0] * 2 ; row++ ) {
//            for( int col = 0 ; col <= row ; col++ ) {
//                int i = row - col;
//                if( i < dimensions[0] && col < dimensions[0] ) {
//                    System.out.print( matrix[i][col] + " " );
//                }
//            }
//            System.out.println();
//        }

