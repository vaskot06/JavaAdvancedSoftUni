package MultidimensionalArraysEXC;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(tokens[0]);
        int cols = Integer.parseInt(tokens[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int[][] threeByThreeMatrix = new int[3][3];

        int sum = 0;
        int bestSUm = 0;
        int first =0;
        int second =0;
        int third =0;
        int fourth =0;
        int fifth =0;
        int sixth =0;
        int seventh =0;
        int eight =0;
        int ningth =0;

        for (int row = 0; row < rows; row++) {

            if (row + 2 >= rows) {
                break;
            }
            for (int col = 0; col < cols; col++) {

                if (col + 2 >= cols) {
                    break;
                }
                sum += matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2] +
                        matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];

                if (sum > bestSUm) {
                    first = matrix[row][col];
                    second = matrix[row][col + 1];
                    third = matrix[row][col + 2];
                    fourth = matrix[row + 1][col];
                    fifth = matrix[row + 1][col + 1];
                    sixth = matrix[row + 1][col + 2];
                    seventh = matrix[row + 2][col];
                    eight = matrix[row + 2][col + 1];
                    ningth = matrix[row + 2][col + 2];
                    bestSUm = sum;
                }
                sum = 0;
            }


        }
        System.out.println("Sum = " + bestSUm);
        System.out.println(first + " " + second  + " " +  third);
        System.out.println(fourth  + " " +  fifth  + " " +  sixth);
        System.out.println(seventh  + " " +  eight  + " " +  ningth);
    }
}
