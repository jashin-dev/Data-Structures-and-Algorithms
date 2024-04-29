package BinarySearchPractice;

public class BinarySearchImplementation {

    public static void main(String[] args) {

        System.out.println(binarySearch(new int[] {1,2,3,4,5,6,7}, 0, 6, 9));

    }

    public static int binarySearch(int[] nums, int low, int high, int target) {

        if(low > high) {

            return -1;

        }

        int mid = low + ((high - low) / 2);

        if(nums[mid] == target) {

            return mid;

        } else if(nums[mid] < target) {

            return binarySearch(nums, mid + 1, high, target);

        }

        return binarySearch(nums, low, mid - 1, target);

    }

}