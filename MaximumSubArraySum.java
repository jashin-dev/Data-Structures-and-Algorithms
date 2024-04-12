package ArraysPractice;

public class MaximumSubArraySum {

    public static void main(String[] args) {

        System.out.println(maxSubArray(new int[] {1}));

    }

    public static int maxSubArray(int[] nums) {

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i <= nums.length - 1; i++) {

            sum = sum + nums[i];
            if(sum > maxSum) {

                maxSum = sum;

            }

            if(sum < 0) {

                sum = 0;

            }

        }

        return maxSum;

    }

}