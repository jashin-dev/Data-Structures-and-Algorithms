package ArraysPractice;

import java.util.Arrays;

public class MoveZeroesTowardsEnd {

    public static void main(String[] args) {

        int[] test = {0,1,0,3,12};
        moveZeroes(test);
        System.out.println(Arrays.toString(test));

    }

    public static void moveZeroes(int[] nums) {

        for(int i = 0; i <= nums.length - 1; i++) {

            if(nums[i] == 0) {

                for(int j = i; j <= nums.length - 1; j++) {

                    if(nums[j] != 0) {

                        swap(nums, i, j);
                        break;

                    }

                }

            }

        }

    }

    public static void swap(int[] array, int index1, int index2) {

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }

}