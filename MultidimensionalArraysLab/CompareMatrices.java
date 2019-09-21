package MultidimensionalArraysLab;


import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] firstMatInput = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(firstMatInput[0]);
        int cols = Integer.parseInt(firstMatInput[1]);

        int[][] firstMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            int[] inputNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            firstMatrix[i] = inputNumbers;
        }

        String[] secondMatrixInput = scanner.nextLine().split(" ");

        int rowsSecond = Integer.parseInt(secondMatrixInput[0]);
        int colsSecond = Integer.parseInt(secondMatrixInput[1]);

        int[][] secondMatrix = new int[rowsSecond][colsSecond];

        for (int i = 0; i < rowsSecond; i++) {
            int[] inputNumbersTwo = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            secondMatrix[i] = inputNumbersTwo;
        }

        if (rows != rowsSecond || cols != colsSecond) {
            System.out.println("not equal");
            return;
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]) {
                    System.out.println("not equal");
                 return;
                }
            }
        }
        System.out.println("equal");
    }
}
