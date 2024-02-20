package LearnTheBasics;

import java.util.Arrays;

public class PrintUsingRecursion {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(printNos(9)));

    }

    public static int[] printNos(int x) {

        int[] arr = new int[x];

        return addElement(x,arr);

    }

    public static int[] addElement(int num, int[] array) {

        if(num >= 1) {

            array[num - 1] = num;

            addElement(num - 1, array);

        }

        return array;

    }

}