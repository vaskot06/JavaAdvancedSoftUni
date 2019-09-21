package MultidimensionalArraysEXC;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rotation = scanner.nextLine();
        String number = rotation.substring(rotation.indexOf("(") + 1, rotation.lastIndexOf(")"));
        int degreeFirst = Integer.parseInt(number);

        String input = scanner.nextLine();
        int bestLength = input.length();

        int counter = 0;
        List<String> inputData = new ArrayList<>();

        while (!input.equals("END")) {
            counter++;
            inputData.add(input);
            if (input.length() > bestLength) {
                bestLength = input.length();

            }
            input = scanner.nextLine();
        }

        char [][] matrix = new char[counter][bestLength];

            for (int row = 0; row < counter; row++) {
                String word = inputData.get(row);
                for (int col = 0; col < bestLength; col++) {
                    if (col > word.length() - 1) {
                        break;
                    }
                    matrix[row][col] = inputData.get(row).charAt(col);
                }
            }

            int degree = degreeFirst % 360;

        if (degree == 90) {
            for (int row = 0; row < bestLength; row++) {
                for (int col = counter - 1; col >= 0; col--) {
                    char rowChar = matrix[col][row];
                    if (rowChar == 0) {
                        rowChar = ' ';
                    }
                    System.out.print(rowChar);
                }
                System.out.println();
            }
        } else if (degree == 180) {
            for (int col = counter - 1; col >= 0; col--) {
                for (int row = bestLength - 1; row >= 0; row--) {
                    char rowChar = matrix[col][row];
                    if (rowChar == 0) {
                        rowChar = ' ';
                    }
                    System.out.print(rowChar);
                }
                System.out.println();
            }
        }   else if (degree == 270) {
            for (int row = bestLength - 1; row >=0; row--) {
                for (int col = 0; col < counter; col++) {
                    char rowChar = matrix[col][row];
                    if (rowChar == 0) {
                        rowChar = ' ';
                    }
                    System.out.print(rowChar);
                }
                System.out.println();
            }
        }else {
            for (int col = 0; col< counter; col++) {
                for (int row = 0; row < bestLength; row++) {
                    char rowChar = matrix[col][row];
                    if (rowChar == 0) {
                        rowChar = ' ';
                    }
                    System.out.print(rowChar);
                }
                System.out.println();
            }
        }
        }


    }

