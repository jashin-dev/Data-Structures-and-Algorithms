package BinarySearchPractice;

public class SplitArrayLargestSum {

    public static void main(String[] args) {

        System.out.println(splitArray(new int[] {7,2,5,10,8}, 2));

    }

    public static int splitArray(int[] nums, int k) {

        int maxE = Integer.MIN_VALUE;
        int maxLimit = 0;
        for(int number : nums) {

            maxE = Math.max(maxE, number);
            maxLimit += number;

        }

        return binarySearch(nums, k, maxE, maxLimit);

    }

    public static int binarySearch(int[] array, int splits, int maximumElement, int maxLimit) {

        long low = maximumElement;
        long high = maxLimit;
        long answer = Integer.MAX_VALUE;

        while(low <= high) {

            long mid = low + (high - low) / 2;
            if(splitCheck(array, splits, mid)) {

                answer = Math.min(answer, mid);
                high = mid - 1;

            } else {

                low = mid + 1;

            }

        }

        return (int) answer;

    }

    public static boolean splitCheck(int[] arr, int splits, long check) {

        int subArrayNumber = 1;
        int totalSumOfCurrentSubarray = arr[0];
        int maxSum = Integer.MIN_VALUE;

        for(int i = 1; i <= arr.length - 1; i++) {

            if(totalSumOfCurrentSubarray + arr[i] <= check) {

                totalSumOfCurrentSubarray += arr[i];
                maxSum = Math.max(maxSum, totalSumOfCurrentSubarray);

            } else {

                totalSumOfCurrentSubarray = arr[i];
                subArrayNumber++;
                maxSum = Math.max(maxSum, totalSumOfCurrentSubarray);

            }

        }

        return ((subArrayNumber <= splits) && maxSum <= check);

    }

}