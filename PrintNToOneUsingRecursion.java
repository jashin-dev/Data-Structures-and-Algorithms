package LearnTheBasics;

import java.util.Arrays;

public class PrintNToOneUsingRecursion {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(printNos(6)));

    }

    public static int[] printNos(int x) {

        int[] arr = new int[x];

        return addNos(x, arr, x);

    }

    public static int[] addNos(int num, int[] array, int count) {

        if(num >= 1) {

            array[count - num] = num;
            addNos(num - 1, array, count);

        }

        return array;

    }

}