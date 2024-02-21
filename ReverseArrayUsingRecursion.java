package LearnTheBasics;

import java.util.Arrays;

public class ReverseArrayUsingRecursion {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(reverseArray(5, new int[] {1, 2, 3, 4, 5})));

    }

    public static int[] reverseArray(int n, int[] nums) {

       int[] num = new int[n];
       int i = 0;

       return reverse(nums, num, n - 1, i);

    }

    public static int[] reverse(int[] arr1, int[] arr2, int index1, int index2) {

        if(index2 >= 0 && index2 <= arr2.length && index1 <= arr2.length && index1 >= 0) {

            arr2[index2] = arr1[index1];

            reverse(arr1, arr2, index1 - 1, index2 + 1);

        }

        return arr2;

    }

}