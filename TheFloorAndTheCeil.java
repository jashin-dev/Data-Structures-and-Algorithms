package BinarySearchPractice;

import java.util.Arrays;

public class TheFloorAndTheCeil {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(getFloorAndCeil(new int[] {3, 4, 4, 7, 8, 10}, 6,2)));

    }

    public static int[] getFloorAndCeil(int[] a, int n, int x) {

        int[] result = new int[2];
        int floor = lowerBoundBinarySearch(a, 0, n - 1, x, Integer.MIN_VALUE);
        if(floor == Integer.MIN_VALUE) {

            floor = -1;

        }
        int ceil = upperBoundBinarySearch(a, 0, n - 1, x, Integer.MAX_VALUE);
        if(ceil == Integer.MAX_VALUE) {

            ceil = -1;

        }
        result[0] = floor;
        result[1] = ceil;

        return result;

    }

    public static int lowerBoundBinarySearch(int[] array, int low, int high, int target, int lowerBound) {

        if(low > high) {

            return lowerBound;

        }

        int mid = low + (high - low) / 2;
        if(array[mid] > target) {

            return lowerBoundBinarySearch(array, 0, mid - 1, target, lowerBound);

        } else {

            lowerBound = Math.max(lowerBound, array[mid]);
            return lowerBoundBinarySearch(array, mid + 1, high, target, lowerBound);

        }

    }

    public static int upperBoundBinarySearch(int[] arr, int low, int high, int target, int upperBound) {

        if(low > high) {

            return upperBound;

        }

        int mid = low + (high - low) / 2;
        if(arr[mid] < target) {

            return upperBoundBinarySearch(arr, mid + 1, high, target, upperBound);

        } else {

            upperBound = Math.min(upperBound, arr[mid]);
            return upperBoundBinarySearch(arr, low, mid - 1, target, upperBound);

        }

    }

}