package BinarySearchPractice;

public class CountOccurrencesOfTheElement {

    public static void main(String[] args) {

        System.out.println(count(new int[] {1,1,1,2,2,3,3}, 7, 3));

    }

    public static int count(int[] arr, int n, int x) {

        int first = Integer.MAX_VALUE;
        int last = Integer.MIN_VALUE;

        first = lowerBinarySearch(arr, 0, n - 1, x, first);
        last = higherBinarySearch(arr, 0, n - 1, x, last);

        if(first == Integer.MAX_VALUE) {

            return 0;

        }

        return last - first + 1;

    }

    public static int lowerBinarySearch(int[] array, int low, int high, int target, int first) {

        if(low > high) {

            return first;

        }

        int mid = low + (high - low) / 2;
        if(array[mid] > target) {

            return lowerBinarySearch(array, low, mid - 1, target, first);

        } else if(array[mid] == target) {

            first = Math.min(first, mid);
            return lowerBinarySearch(array, low, mid - 1, target, first);

        }

        return lowerBinarySearch(array, mid + 1, high, target, first);

    }

    public static int higherBinarySearch(int[] array, int low, int high, int target, int last) {

        if(low > high) {

            return last;

        }

        int mid = low + (high - low) / 2;
        if(array[mid] > target) {

            return higherBinarySearch(array, low, mid - 1, target, last);

        } else if(array[mid] == target) {

            last = Math.max(last, mid);
            return higherBinarySearch(array, mid + 1, high, target, last);

        }

        return higherBinarySearch(array, mid + 1, high, target, last);

    }

}