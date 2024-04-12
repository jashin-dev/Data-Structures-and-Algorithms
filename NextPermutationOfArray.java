package ArraysPractice;

import java.util.Arrays;

public class NextPermutationOfArray {

    public static void main(String[] args) {

        int[] test = {1,1,5};
        nextPermutation(test);
        System.out.println(Arrays.toString(test));

    }

    public static void nextPermutation(int[] nums) {

        int breakPoint = -1;
        for(int i = nums.length - 1; i >= 1; i--) {

            if(nums[i - 1] < nums[i]) {

                breakPoint = i - 1;
                break;

            }

        }

        if(breakPoint == -1) {

            reverse(nums, 0, nums.length - 1);
            return;

        }

        for(int j = nums.length - 1; j >= 0; j--) {

            if(nums[j] > nums[breakPoint]) {

                swap(nums, breakPoint, j);
                break;

            }

        }

        reverse(nums, breakPoint + 1, nums.length - 1);

    }

    public static void reverse(int[] arr, int start, int end) {

        while(start < end) {

            swap(arr, start, end);
            start++;
            end--;

        }

    }

    public static void swap(int[] array, int index1, int index2) {

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }

}