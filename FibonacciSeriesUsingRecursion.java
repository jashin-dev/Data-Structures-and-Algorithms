package LearnTheBasics;

import java.util.Arrays;

public class FibonacciSeriesUsingRecursion {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(generateFibonacciNumbers(2)));

    }

    public static int[] generateFibonacciNumbers(int n) {

        int[] series = new int[n];


        if (n == 1) {

            series[0] = 0;
            return series;

        } else if (n == 2) {

            series[0] = 0;
            series[1] = 1;
            return series;

        } else {

            series[0] = 0;
            series[1] = 1;
            int index = 2;
            return bridge(index, series);

        }

    }

    public static int[] bridge(int position, int[] array) {

        if (position < array.length) {

            array[position] = array[position - 1] + array[position - 2];

            bridge(position + 1, array);

        }

        return array;

    }

}