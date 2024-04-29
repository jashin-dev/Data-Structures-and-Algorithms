package BinarySearchPractice;

public class LowerBoundInAnArray {

    public static void main(String[] args) {

        System.out.println(lowerBound(new int[] {1, 2, 2, 3}, 4, 2));

    }

    public static int lowerBound(int[] arr, int n, int x) {

        return lowerBoundBinarySearch(arr, 0, arr.length - 1, x, n);

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