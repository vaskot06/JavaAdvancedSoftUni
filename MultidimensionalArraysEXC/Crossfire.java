package MultidimensionalArraysEXC;

import java.util.Arrays;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int row = input[0];
        int col = input[1];

        int[][] matrix = new int[row][col];

        int lastNumber = 0;

        for (int rows = 0; rows < row; rows++) {
            for (int cols = 0; cols < col; cols++) {

                if (rows == 0) {
                    matrix[rows][cols] = cols + 1;
                } else if (rows == 1) {
                    if (cols == 0) {
                        lastNumber = matrix[rows - 1][col - 1];
                        matrix[rows][cols] = lastNumber + 1;
                    } else {
                        matrix[rows][cols] = matrix[rows][cols - 1] + 1;
                    }
                } else {
                    if (cols == 0) {
                        matrix[rows][cols] = (rows * lastNumber) + 1;
                    } else {
                        matrix[rows][cols] = (rows * lastNumber) + cols + 1;
                    }
                }

            }
        }

        String command = scanner.nextLine();

        while (!command.equals("Nuke it from orbit")) {
            String[] tokens = command.split(" ");

            int matrixRow = Integer.parseInt(tokens[0]);
            int matrixCol = Integer.parseInt(tokens[1]);
            int radius = Integer.parseInt(tokens[2]);


            command = scanner.nextLine();
        }

    }
}
