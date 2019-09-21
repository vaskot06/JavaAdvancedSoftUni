package MultidimensionalArraysEXC;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().split(" ");
        }

        while (true) {
            String commands = scanner.nextLine();

            if (commands.equals("END")) {
                return;
            }

            String[] tokens = commands.split(" ");

            if (!tokens[0].equals("swap")) {
                System.out.println("Invalid input!");
                continue;
            }

            if (tokens.length != 5) {
                System.out.println("Invalid input!");
                continue;
            }

            int firstCoordinate = Integer.parseInt(tokens[1]);
            int secondCoordinate = Integer.parseInt(tokens[2]);
            int thirdCoordinate = Integer.parseInt(tokens[3]);
            int fourthCoordinate = Integer.parseInt(tokens[4]);


            if (firstCoordinate > rows || secondCoordinate > cols) {
                System.out.println("Invalid input!");
                continue;
            }

            if (thirdCoordinate > rows || fourthCoordinate > cols) {
                System.out.println("Invalid input!");
                continue;
            }

            String elementFromFirstRowCol = matrix[firstCoordinate][secondCoordinate];
            matrix[firstCoordinate][secondCoordinate] = matrix[thirdCoordinate][fourthCoordinate];
            matrix[thirdCoordinate][fourthCoordinate] = elementFromFirstRowCol;

            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    System.out.print(matrix[row][col] + " ");
                }
                System.out.println();
            }

        }
    }
}
