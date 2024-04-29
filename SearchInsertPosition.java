package BinarySearchPractice;

public class SearchInsertPosition {

    public static void main(String[] args) {

        System.out.println(searchInsert(new int[] {1,3,5,6}, 7));

    }

    public static int searchInsert(int[] nums, int target) {

        return lowerBoundBinarySearch(nums, 0, nums.length - 1, target, nums.length);

    }

    public static int lowerBoundBinarySearch(int[] array, int low, int high, int target, int lowerBound) {

        if(low > high) {

            return lowerBound;

        }

        int mid = low + (high - low) / 2;
        if(array[mid] >= target) {

            lowerBound = Math.min(mid, lowerBound);
            return lowerBoundBinarySearch(array, low, mid - 1, target, lowerBound);

        } else {

            return lowerBoundBinarySearch(array, mid + 1, high, target, lowerBound);

        }

    }

}