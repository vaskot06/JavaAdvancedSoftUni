package MultidimensionalArraysEXC;

public class Diag{
    public static void main(String[] args) {

        int [][] array = new int[15][15];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int x = Math.max(0, i - 1); x <= Math.min(i + 1, array.length); x++) {
                    for (int y = Math.max(0, j - 1); y <= Math.min(j + 1, array[i].length); y++) {
                        if (x >= 0 && y >= 0 && x < array.length && y < array[i].length) {
                            if(x!=i || y!=j){
                                array[x][y] = 2;
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}