package LearnTheBasics;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArrayBasics {

    public static void main(String[] args) {

        int[][] digits = new int[3][3];

        // input in 2D array

        Scanner input = new Scanner(System.in);
        for(int row = 0; row < digits.length; row++) {

        for(int column = 0; column < digits[row].length; column++) {

            digits[row][column] = input.nextInt();

        }

        }

        // output from a 2D array

        for(int[] array : digits) {

            System.out.print(Arrays.toString(array));
            System.out.println();
        }

    }

}