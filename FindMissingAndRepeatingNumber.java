package ArraysPractice;

import java.util.Arrays;

public class FindMissingAndRepeatingNumber {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(findMissingRepeatingNumbers(new int[] {1, 2, 1})));

    }

    public static int[] findMissingRepeatingNumbers(int[] a) {

        int repeatingNumber = 0;
        int missingNumber = 0;

        long sum = 0;
        long originalSum = ((long) a.length * (a.length + 1)) / 2;

        long squareSum = 0;
        long originalSquareSum = (a.length * (a.length + 1) * ((2L * a.length) + 1)) / 6;

        for(int i = 0; i <= a.length - 1; i++) {

            sum = sum + a[i];
            squareSum = squareSum + ((long) a[i] * a[i]);

        }

        long value1 = sum - originalSum;
        long value2 = (squareSum - originalSquareSum) / value1;

        repeatingNumber = (int) (value2 + value1) / 2;
        missingNumber = repeatingNumber - (int) value1;

        int[] result = new int[2];
        result[0] = repeatingNumber;
        result[1] = missingNumber;

        return result;

    }

}