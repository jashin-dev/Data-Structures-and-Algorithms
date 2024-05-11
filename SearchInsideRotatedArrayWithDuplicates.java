package BinarySearchPractice;

public class SearchInsideRotatedArrayWithDuplicates {

    public static void main(String[] args) {

        System.out.println(search(new int[] {1,0,1,1,1} , 0));

    }

    public static boolean search(int[] nums, int target) {

        return searchFunction(nums, nums.length, target);

    }

    public static boolean searchFunction(int[] arr, int n, int target) {

        int low = 0;
        int high = n - 1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(arr[mid] == target) {

                return true;

            }

            if(arr[low] == arr[mid] && arr[mid] == arr[high]) {

                low = low + 1;
                high = high - 1;
                continue;

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

        return false;

    }

}