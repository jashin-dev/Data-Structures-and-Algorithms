package ArraysPractice;

import java.util.Arrays;

public class RotateMatrixBy90Degrees {

    public static void main(String[] args) {

        int[][] test = {{5,1,9,11}, {2,4,8,10}, {13,3,6,7}, {15,14,12,16}};
        rotate(test);
        for(int[] array : test) {

            System.out.println(Arrays.toString(array));

        }

    }

    public static void rotate(int[][] matrix) {

        for(int i = 0; i <= matrix.length - 2; i++) {

            for(int j = i + 1; j <= matrix[i].length - 1; j++) {

                swap(matrix, i, j);

            }

        }

        for(int num = 0; num <= matrix.length - 1; num++) {

            reverse(matrix, num);

        }

    }

    public static void reverse(int[][] matrix, int row) {

        int start = 0;
        int stop = matrix[row].length - 1;

        while(start < stop) {

            int temp2 = matrix[row][start];
            matrix[row][start] = matrix[row][stop];
            matrix[row][stop] = temp2;

            start++;
            stop--;

        }

    }

    public static void swap(int[][] matrix, int index1, int index2) {

        int temp = matrix[index1][index2];
        matrix[index1][index2] = matrix[index2][index1];
        matrix[index2][index1] = temp;

    }

}