package BinarySearchPractice;

public class FindTheMissingKthPositiveInteger {

    public static void main(String[] args) {

        System.out.println(findKthPositive(new int[] {2}, 1));

    }

    public static int findKthPositive(int[] arr, int k) {

        return binarySearch(arr, k);

    }

    public static int binarySearch(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {

            int mid = low + (high - low) / 2;
            if(nums[mid] - (mid + 1) < target) {

                low = mid + 1;

            } else {

                high = mid - 1;

            }

        }

        return low + target;

    }

}