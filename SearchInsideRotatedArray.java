package BinarySearchPractice;

public class SearchInsideRotatedArray {

    public static void main(String[] args) {

        System.out.println(search(new int[] {4,5,6,7,0,1,2}, 2));

    }

    public static int search(int[] nums, int target) {

        return searchInsideRotatedArray(nums, nums.length, target);

    }

    public static int searchInsideRotatedArray(int[] arr, int n, int target) {

        int low = 0;
        int high = n - 1;

        while(low <= high) {

            int mid = low + (high - low) / 2;
            if(arr[mid] == target) {

                return mid;

            }

            if(arr[low] <= arr[mid]) {

                if(arr[low] <= target && target <= arr[mid]) {

                    high = mid - 1;

                } else {

                    low = mid + 1;

                }

            } else {

                if(arr[mid] <= target && target <= arr[high]) {

                    low = mid + 1;

                } else {

                    high = mid - 1;

                }

            }

        }

        return -1;

    }

}