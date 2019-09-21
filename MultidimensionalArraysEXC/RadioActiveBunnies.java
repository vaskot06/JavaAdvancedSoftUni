package MultidimensionalArraysEXC;

import java.util.Arrays;
import java.util.Scanner;

public class RadioActiveBunnies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int row = dimensions[0];
        int col = dimensions[1];
        boolean isFinal = false;
        boolean isDead = false;

        char[][] matrix = new char[row][col];

        for (int i = 0; i < matrix.length; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = line.charAt(j);
            }
        }

        String commands = scanner.nextLine();
        int winnerRow = 0;
        int winnerCol = 0;
        boolean successfulMove = false;


        for (int command = 0; command < commands.length(); command++) {

            char direction = commands.charAt(command);

            if (direction == 'U') {
                for (int r = 0; r < matrix.length; r++) {
                    for (int c = 0; c < matrix[r].length; c++) {
                        if (matrix[r][c] == 'P') {
                            if (r - 1 >= 0) {
                                matrix[r][c] = '.';
                                if (matrix[r - 1][c] == 'B') {
                                    isDead = true;
                                    winnerRow = r - 1;
                                    winnerCol = c;
                                } else {
                                    matrix[r - 1][c] = 'P';
                                    successfulMove = true;
                                    break;
                                }
                            } else {
                                winnerRow = r;
                                winnerCol = c;
                                matrix[r][c] = '.';
                                isFinal = true;
                            }
                        }
                    }
                    if (successfulMove == true) {
                        successfulMove = false;
                        break;
                    }
                }
            } else if (direction == 'L') {
                for (int r = 0; r < matrix.length; r++) {
                    for (int c = 0; c < matrix[r].length; c++) {
                        if (matrix[r][c] == 'P') {
                            if (c - 1 >= 0) {
                                matrix[r][c] = '.';
                                if (matrix[r][c - 1] == 'B') {
                                    isDead = true;
                                    winnerRow = r;
                                    winnerCol = c - 1;
                                } else {
                                    matrix[r][c - 1] = 'P';
                                    successfulMove = true;
                                    break;
                                }
                            } else {
                                winnerRow = r;
                                winnerCol = c;
                                matrix[r][c] = '.';
                                isFinal = true;
                            }
                        }
                    }
                    if (successfulMove == true) {
                        successfulMove = false;
                        break;
                    }
                }
            } else if (direction == 'R') {
                for (int r = 0; r < matrix.length; r++) {
                    for (int c = 0; c < matrix[r].length; c++) {
                        if (matrix[r][c] == 'P') {
                            if (c + 1 < matrix[r].length) {
                                matrix[r][c] = '.';
                                if (matrix[r][c + 1] == 'B') {
                                    isDead = true;
                                    winnerRow = r;
                                    winnerCol = c + 1;
                                } else {
                                    matrix[r][c + 1] = 'P';
                                    successfulMove = true;
                                    break;
                                }
                            } else {
                                winnerRow = r;
                                winnerCol = c;
                                matrix[r][c] = '.';
                                isFinal = true;
                            }
                        }
                    }
                    if (successfulMove == true) {
                        successfulMove = false;
                        break;
                    }
                }
            } else if (direction == 'D') {
                for (int r = 0; r < matrix.length; r++) {
                    for (int c = 0; c < matrix[r].length; c++) {
                        if (matrix[r][c] == 'P') {
                            if (r + 1 < matrix.length) {
                                matrix[r][c] = '.';
                                if (matrix[r + 1][c] == 'B') {
                                    isDead = true;
                                    winnerRow = r + 1;
                                    winnerCol = c;
                                } else {
                                    matrix[r + 1][c] = 'P';
                                    successfulMove = true;
                                    break;
                                }
                            } else {
                                winnerRow = r;
                                winnerCol = c;
                                matrix[r][c] = '.';
                                isFinal = true;
                            }
                        }
                    }
                        if (successfulMove == true) {
                         successfulMove = false;
                       break;
                    }
                }

            }


            for (int r = 0; r < row; r++) {
                for (int c = 0; c < col; c++) {
                    char check = matrix[r][c];

                    if (check == 'B') {
                        if (r - 1 >= 0) {
                            if (matrix[r - 1][c] == 'P') {
                                isDead = true;
                                winnerRow = r - 1;
                                winnerCol = c;
                            } else if (matrix[r - 1][c] == '.'){
                                matrix[r - 1][c] = 'V';
                            }
                        }

                        if (c - 1 >= 0) {
                            if (matrix[r][c - 1] == 'P') {
                                isDead = true;
                                winnerRow = r;
                                winnerCol = c - 1;
                            } else if (matrix[r][c - 1] == '.'){
                                matrix[r][c - 1] = 'V';
                            }
                        }

                        if (r + 1 < matrix.length) {
                            if (matrix[r + 1][c] == 'P' ) {
                                isDead = true;
                                winnerRow = r + 1;
                                winnerCol = c;
                            }else if (matrix[r + 1][c] == '.'){
                                matrix[r + 1][c] = 'V';
                            }
                        }

                        if (c + 1 < matrix[r].length) {
                            if (matrix[r][c + 1] == 'P') {
                                isDead = true;
                                winnerRow = r;
                                winnerCol = c + 1;
                            }else if (matrix[r][c + 1] =='.'){
                                matrix[r][c + 1] = 'V';
                            }
                        }


                    }
                }
            }

            for (int r = 0; r < matrix.length; r++) {
                for (int c = 0; c < matrix[r].length; c++) {
                    char check = matrix[r][c];

                    if (check == 'V') {
                        matrix[r][c] = 'B';
                    }
                    if (check == 'P' && isDead == true) {
                        matrix[r][c] = 'B';
                    }
                }
            }
            if (isFinal == true) {
                break;
            }
            if (isDead == true) {
                break;
            }
        }

        printMatrix(matrix);
        if (isDead == false) {
            System.out.println("won: " + winnerRow + " " + winnerCol);
        } else {
            System.out.println("dead: " + winnerRow + " " + winnerCol);
        }
    }

    public static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}



