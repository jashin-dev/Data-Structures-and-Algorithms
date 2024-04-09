package ArraysPractice;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[] {3,3}, 6)));

    }

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        for(int n = 0; n <= nums.length - 1; n++) {

            int remainingValue = target - nums[n];
            for(int m = 0; m <= nums.length - 1; m++) {

                if(nums[m] == remainingValue && m != n) {

                    result[0] = n;
                    result[1] = m;
                    return result;

                }

            }

        }

        return result;

    }

}