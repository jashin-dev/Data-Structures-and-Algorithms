package LearnTheBasics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        Scanner input = new Scanner(System.in);

        // input in array

        for(int index = 0; index < numbers.length; index++) {

            numbers[index] = input.nextInt();

        }

        // output form array

        for (int number : numbers) {

            System.out.println(number);

        }

        System.out.println(Arrays.toString(numbers));

    }

}