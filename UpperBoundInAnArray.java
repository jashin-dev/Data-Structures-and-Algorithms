package BinarySearchPractice;

public class UpperBoundInAnArray {

    public static void main(String[] args) {

        System.out.println(upperBound(new int[] {1, 2, 3, 4, 5, 5, 6}, 5, 7));

    }

    public static int upperBound(int[] arr, int x, int n) {

        return upperBoundBinarySearch(arr, 0, arr.length - 1, x, n);

    }

    public static int upperBoundBinarySearch(int[] array, int low, int high, int target, int upperBound) {

        if(low > high) {

            return upperBound;

        }

        int mid = low + (high - low) / 2;
        if(array[mid] > target) {

            upperBound = Math.min(mid, upperBound);
            return upperBoundBinarySearch(array, low, mid - 1, target, upperBound);

        } else {

            return upperBoundBinarySearch(array, mid + 1, high, target, upperBound);

        }

    }

}