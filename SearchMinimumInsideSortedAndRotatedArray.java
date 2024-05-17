package BinarySearchPractice;

public class SearchMinimumInsideSortedAndRotatedArray {

    public static void main(String[] args) {

        System.out.println(findMin(new int[] {11,13,15,17}));

    }

    public static int findMin(int[] nums) {

        return customBinarySearch(nums, Integer.MAX_VALUE);

    }

    public static int customBinarySearch(int[] arr, int counter) {

        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {

            int mid = low + (high - low) / 2;
            if(arr[low] <= arr[mid]) {

                counter = Math.min(counter, arr[low]);
                low = mid + 1;

            } else {

                counter = Math.min(counter, arr[mid]);
                high = mid - 1;

            }

        }

        return counter;

    }

}