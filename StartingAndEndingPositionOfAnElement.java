package BinarySearchPractice;

import java.util.Arrays;

public class StartingAndEndingPositionOfAnElement {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(searchRange(new int[] {}, 0)));

    }

    public static int[] searchRange(int[] nums, int target) {

        int[] positions = new int[2];
        int startingPosition = Integer.MAX_VALUE;
        int endingPosition = Integer.MIN_VALUE;
        positions[0] = startingPosition;
        positions[1] = endingPosition;

        positions[0] = startingPositionBinarySearch(nums, 0 ,nums.length - 1, target, positions);
        positions[1] = endingPositionBinarySearch(nums, 0, nums.length - 1, target, positions);

        if(nums.length == 0 || ((positions[0] == Integer.MAX_VALUE) && (positions[1] == Integer.MIN_VALUE))) {

            positions[0] = -1;
            positions[1] = -1;

            return positions;

        }

        return positions;

    }

    public static int startingPositionBinarySearch(int[] array, int low, int high, int target, int[] arr) {

        if(low > high) {

            return arr[0];

        }

        int mid = low + (high - low) / 2;
        if(array[mid] > target) {

            return startingPositionBinarySearch(array, low, mid - 1, target, arr);

        } else if(array[mid] == target) {

            arr[0] = Math.min(arr[0], mid);

            return startingPositionBinarySearch(array, low, mid - 1, target, arr);

        }

        return startingPositionBinarySearch(array, mid + 1, high, target, arr);

    }

    public static int endingPositionBinarySearch(int[] array, int low, int high, int target, int[] arr) {

        if(low > high) {

            return arr[1];

        }

        int mid = low + (high - low) / 2;
        if(array[mid] > target) {

            return endingPositionBinarySearch(array, low, mid - 1, target, arr);

        } else if(array[mid] == target) {

            arr[1] = Math.max(arr[1], mid);

            return endingPositionBinarySearch(array, mid + 1, high, target, arr);

        }

        return endingPositionBinarySearch(array, mid + 1, high, target, arr);

    }

}