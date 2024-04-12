package ArraysPractice;

import java.util.Arrays;

public class RearrangePositiveAndNegativeElementInArray {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(rearrangeArray(new int[] {-1,1})));

    }

    public static int[] rearrangeArray(int[] nums) {

        boolean check = true;
        for(int i = 0; i <= nums.length - 1; i++) {

            if(i % 2 == 0 && nums[i] > 0 || i % 2 != 0 && nums[i] < 0) {

                check = true;

            } else {

                check = false;
                break;

            }

        }

        if(check) {

            return nums;

        } else {

            int[] result = new int[nums.length];
            int positive = 0;
            int negative = 1;

            for(int j = 0; j <= nums.length - 1; j++) {

                if(nums[j] > 0 ) {

                    result[positive] = nums[j];
                    positive = positive + 2;

                } else if(nums[j] < 0) {

                    result[negative] = nums[j];
                    negative = negative + 2;

                }

            }

            return result;

        }

    }

}