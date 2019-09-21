package MultidimensionalArraysEXC;

import java.util.Scanner;

public class TheHeiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //player start 8,8;

        int[][] chamber = new int[15][15];
        int startPosition = -1;
        double playerDamage = Double.parseDouble(scanner.nextLine());
        double playerHealth = 18500;
        double heiganHealth = 3000000;

        for (int i = 0; i < chamber.length; i++) {
            for (int j = 0; j < chamber.length; j++) {
                chamber[7][7] = startPosition;
            }
        }


        while (playerHealth > 0 && heiganHealth > 0) {

            heiganHealth -= playerDamage;

            if (heiganHealth <= 0) {
                return;
            }

            String[] cmd = scanner.nextLine().split(" ");
            String spell = cmd[0];
            int r = Integer.parseInt(cmd[1]);
            int c = Integer.parseInt(cmd[2]);
            int location = chamber[r][c];

            if (r - 1 >= 0) {
                chamber[r - 1][c] = 2;
            }

            if (c - 1 >= 0) {
                chamber[r][c - 1] = 2;
            }

            if (r + 1 < chamber.length) {
                chamber[r + 1][c] = 2;
            }

            if (c + 1 < chamber.length) {
                chamber[r][c + 1] = 2;
            }
            if (r - 1 >= 0 && c - 1 >= 0) {
                chamber[r - 1][c - 1] = 2;
            }
            if (r + 1 < chamber.length && c + 1 < chamber.length) {
                chamber[r + 1][c + 1] = 2;
            }
            if (r + 1 < chamber.length && c - 1 >= 0) {
                chamber[r + 1][c - 1] = 2;
            }
            if (r - 1 >= 0 && c + 1 < chamber.length) {

                chamber[r - 1][c + 1] = 2;
            }


            if (spell.equals("Cloud")) {

                for (int row = 0; row < 15; row++) {
                    for (int col = 0; col < 15; col++) {


                    }
                }


            }

            for (int i = 0; i < chamber.length; i++) {
                for (int j = 0; j < chamber.length; j++) {
                    if (chamber[i][j] > 0) {
                        chamber[i][j] = 0;
                    }
                }
            }

        }

    }

}

