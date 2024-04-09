package ArraysPractice;

import java.util.Arrays;

public class SortZeroOneAndTwo {

    public static void main(String[] args) {

        int[] test = {2,0,2,1,1,0};
        sortColors(test);
        System.out.println(Arrays.toString(test));

    }

    public static void sortColors(int[] nums) {

        for(int i = 0; i <= nums.length - 1; i++) {

            for(int j = i; j <= nums.length - 1; j++) {

                if(nums[j] < nums[i]) {

                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;

                }

            }

        }

    }

}