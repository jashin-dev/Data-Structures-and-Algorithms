package ArraysPractice;

import java.util.Arrays;

public class SetMatrixZeroes {

    public static void main(String[] args) {

        int[][] test = {{0,1,2,0},
                        {3,7,3,2},
                        {1,3,1,5}};
        setZeroes(test);
        for(int[] array : test) {

            System.out.println(Arrays.toString(array));

        }

    }

    public static void setZeroes(int[][] matrix) {

        int count = 1;
        for(int i = 0; i <= matrix.length - 1; i++) {

            for(int j = 0; j <= matrix[i].length - 1; j++) {

                if(matrix[i][j] == 0) {

                    matrix[i][0] = 0;
                    if(j == 0) {

                        count = 0;

                    } else {

                        matrix[0][j] = 0;

                    }

                }

            }

        }

        for(int i2 = 1; i2 <= matrix.length - 1; i2++) {

            for(int j2 = 1; j2 <= matrix[i2].length - 1; j2++) {

                if(matrix[i2][0] == 0 || matrix[0][j2] == 0) {

                    matrix[i2][j2] = 0;

                }

            }

        }

        if(matrix[0][0] == 0) {

            for(int n = 1; n <= matrix[0].length - 1; n++) {

                matrix[0][n] = 0;

            }

        }

        if(count == 0) {

            for(int m = 0; m <= matrix.length - 1; m++) {

                matrix[m][0] = 0;

            }

        }

    }

}