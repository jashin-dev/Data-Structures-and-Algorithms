package ArraysPractice;

import java.util.Arrays;

public class RotateAnArrayTowardsRight {

    public static void main(String[] args) {

        int[] test = {1, 2, 3, 4, 5};
        rotate(test, 2);
        System.out.println(Arrays.toString(test));

    }

    public static void rotate(int[] nums, int k) {

        if(k > nums.length) {

            k = k % nums.length;

        }

        int breakPoint = nums.length - 1 - k;
        reverse(nums, 0 , breakPoint);
        reverse(nums, breakPoint + 1, nums.length - 1);
        reverse(nums, 0, nums.length - 1);

    }

    public static void reverse(int[] array, int start, int stop) {

        int i = start;
        int j = stop;

        while( i < j) {

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

            i++;
            j--;
        }

    }

}