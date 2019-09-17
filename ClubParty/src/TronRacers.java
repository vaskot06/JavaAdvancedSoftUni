import java.util.Scanner;

public class TronRacers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //12:04 - 12:54
        //9:01 - 9:48
        //20:54 - 21:02

        int n = Integer.parseInt(scanner.nextLine());

        char[][] matrix  = new char[n][n];

        for (int i = 0; i < n; i++) {
            String cols = scanner.nextLine();
            for (int j = 0; j < cols.length(); j++) {
                matrix[i][j] = cols.charAt(j);
            }

        }

        System.out.println();
        while (true) {
            String[] tokens = scanner.nextLine().split(" ");
            String leftPlayerCommand =  tokens[0];
            String rightPlayerCommand =  tokens[1];
            boolean leftMove = false;
            boolean rightMove = false;
            boolean leftPlayerDead = false;
            boolean rightPlayerDead = false;
            if (leftPlayerCommand.equals("down")) {
                for (int r = 0; r < matrix.length; r++) {
                    for (int c = 0; c < matrix.length; c++) {
                        if (matrix[r][c] == 'f') {
                            matrix[r][c] = 'F';
                            if (r + 1 > matrix.length - 1) {
                                if (matrix[0][c] == 's' || matrix[0][c] == 'S') {
                                    matrix[0][c] = 'x';
                                    printMatrix(matrix);
                                    return;
                                }
                                matrix[0][c] = 'f';
                                leftMove = true;
                                break;
                            }else {
                                if (matrix[r + 1][c] == 's' || matrix[r + 1][c] == 'S') {
                                    matrix[r + 1][c] = 'x';
                                    printMatrix(matrix);
                                    return;
                                }
                                matrix[r+1][c] = 'f';
                                leftMove = true;
                                break;
                            }
                        }
                    }
                    if (leftMove == true) {
                        break;
                    }
                }
            }else if (leftPlayerCommand.equals("right")) {
                for (int r = 0; r < matrix.length; r++) {
                    for (int c = 0; c < matrix.length; c++) {
                        if (matrix[r][c] == 'f') {
                            matrix[r][c] = 'F';
                            if (c + 1 > matrix.length - 1) {
                                if (matrix[r][0] == 's' || matrix[r][0] == 'S') {
                                    matrix[r][0] = 'x';
                                    printMatrix(matrix);
                                    return;
                                }
                                matrix[r][0] = 'f';
                                leftMove = true;
                                break;
                            }else {
                                if (matrix[r][c + 1] == 's' || matrix[r][c + 1] == 'S') {
                                    matrix[r][c + 1] = 'x';
                                    printMatrix(matrix);
                                    return;
                                }
                                matrix[r][c + 1] = 'f';
                                leftMove = true;
                                break;
                            }
                        }
                    }
                    if (leftMove == true) {
                        break;
                    }
                }
            }else if (leftPlayerCommand.equals("left")) {
                for (int r = 0; r < matrix.length; r++) {
                    for (int c = 0; c < matrix.length; c++) {
                        if (matrix[r][c] == 'f') {
                            matrix[r][c] = 'F';
                            if (c - 1 < 0) {
                                if (matrix[r][matrix.length-1] == 's' || matrix[r][matrix.length-1] == 'S') {
                                    matrix[r][matrix.length-1] = 'x';
                                    printMatrix(matrix);
                                    return;
                                }
                                matrix[r][matrix.length-1] = 'f';
                                leftMove = true;
                                break;
                            }else {
                                if (matrix[r][c - 1] == 's' || matrix[r][c - 1] == 'S') {
                                    matrix[r][c - 1] = 'x';
                                    printMatrix(matrix);
                                    return;
                                }
                                matrix[r][c - 1] = 'f';
                                leftMove = true;
                                break;
                            }
                        }
                    }
                    if (leftMove == true) {
                        break;
                    }
                }
            }else if (leftPlayerCommand.equals("up")) {
                for (int r = 0; r < matrix.length; r++) {
                    for (int c = 0; c < matrix.length; c++) {
                        if (matrix[r][c] == 'f') {
                            matrix[r][c] = 'F';
                            if (r - 1 < 0) {
                                if (matrix[matrix.length - 1][c] == 's' || matrix[matrix.length - 1][c] == 'S') {
                                    matrix[matrix.length - 1][c] = 'x';
                                    printMatrix(matrix);
                                    return;
                                }
                                matrix[matrix.length - 1][c] = 'f';
                                leftMove = true;
                                break;
                            }else {
                                if (matrix[r - 1][c] == 's' || matrix[r - 1][c] == 'S') {
                                    matrix[r - 1][c] = 'x';
                                    printMatrix(matrix);
                                    return;
                                }
                                matrix[r - 1][c] = 'f';
                                leftMove = true;
                                break;
                            }
                        }
                    }
                    if (leftMove == true) {
                        break;
                    }
                }
            }
            if (rightPlayerCommand.equals("down")) {
                for (int r = 0; r < matrix.length; r++) {
                    for (int c = 0; c < matrix.length; c++) {
                        if (matrix[r][c] == 's') {
                            matrix[r][c] = 'S';
                            if (r + 1 > matrix.length - 1) {
                                if (matrix[0][c] == 'f' || matrix[0][c] == 'F') {
                                    matrix[0][c] = 'x';
                                    printMatrix(matrix);
                                    return;
                                }
                                matrix[0][c] = 's';
                                rightMove = true;
                                break;
                            }else {
                                if (matrix[r + 1][c] == 'f' || matrix[r + 1][c] == 'F') {
                                    matrix[r + 1][c] = 'x';
                                    printMatrix(matrix);
                                    return;
                                }
                                matrix[r+1][c] = 's';
                                rightMove = true;
                                break;
                            }
                        }
                    }
                    if (rightMove == true) {
                        break;
                    }
                }
            }else if (rightPlayerCommand.equals("right")) {
                for (int r = 0; r < matrix.length; r++) {
                    for (int c = 0; c < matrix.length; c++) {
                        if (matrix[r][c] == 's') {
                            matrix[r][c] = 'S';
                            if (c + 1 > matrix.length - 1) {
                                if (matrix[r][0] == 'f' || matrix[r][0] == 'F') {
                                    matrix[r][0] = 'x';
                                    printMatrix(matrix);
                                    return;
                                }
                                matrix[r][0] = 's';
                                rightMove = true;
                                break;
                            }else {
                                if (matrix[r][c + 1] == 'f' || matrix[r][c + 1] == 'F') {
                                    matrix[r][c + 1] = 'x';
                                    printMatrix(matrix);
                                    return;
                                }
                                matrix[r][c + 1] = 's';
                                rightMove= true;
                                break;
                            }
                        }
                    }
                    if (rightMove == true) {
                        break;
                    }
                }
            }else  if (rightPlayerCommand.equals("left")) {
                for (int r = 0; r < matrix.length; r++) {
                    for (int c = 0; c < matrix.length; c++) {
                        if (matrix[r][c] == 's') {
                            matrix[r][c] = 'S';
                            if (c - 1 < 0) {
                                if (matrix[r][matrix.length-1] == 'f' || matrix[r][matrix.length-1] == 'F') {
                                    matrix[r][matrix.length-1] = 'x';
                                    printMatrix(matrix);
                                    return;
                                }
                                matrix[r][matrix.length-1] = 's';
                                rightMove = true;
                                break;
                            }else {
                                if (matrix[r][c - 1] == 'f' || matrix[r][c - 1] == 'F') {
                                    matrix[r][c - 1] = 'x';
                                    printMatrix(matrix);
                                    return;
                                }
                                matrix[r][c - 1] = 's';
                                rightMove = true;
                                break;
                            }
                        }
                    }
                    if (rightMove == true) {
                        break;
                    }
                }
            }else if (rightPlayerCommand.equals("up")) {
                for (int r = 0; r < matrix.length; r++) {
                    for (int c = 0; c < matrix.length; c++) {
                        if (matrix[r][c] == 's') {
                            matrix[r][c] = 'S';
                            if (r - 1 < 0) {
                                if (matrix[matrix.length - 1][c] == 'f' || matrix[matrix.length - 1][c] == 'F') {
                                    matrix[matrix.length - 1][c] = 'x';
                                    printMatrix(matrix);
                                    return;
                                }
                                matrix[matrix.length - 1][c] = 's';
                                rightMove = true;
                                break;
                            }else {
                                if (matrix[r - 1][c] == 'f' || matrix[r - 1][c] == 'F') {
                                    matrix[r - 1][c] = 'x';
                                    printMatrix(matrix);
                                    return;
                                }
                                matrix[r - 1][c] = 's';
                                rightMove= true;
                                break;
                            }
                        }
                    }
                    if (rightMove == true) {
                        break;
                    }
                }
            }
        }
    }

    public static void printMatrix(char[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 'F') {
                    matrix[i][j] = 'f';
                }
                if (matrix[i][j] == 'S') {
                    matrix[i][j] = 's';
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
