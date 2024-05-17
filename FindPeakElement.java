package BinarySearchPractice;

public class FindPeakElement {

    public static void main(String[] args) {

        System.out.println(findPeakElement(new int[] {1,2,1,3,5,6,4}));

    }

    public static int findPeakElement(int[] nums) {

        return binarySearch(nums);

    }

    public static int binarySearch(int[] array) {

        if(array.length == 1) {

            return array[0];

        }

        if(array[0] > array[1]) {

            return array[0];

        } else if(array[array.length - 1] > array[array.length - 2]) {

            return array[array.length - 1];

        }

        int low = 1;
        int high = array.length - 2;

        while(low <= high) {

            int mid = low + (high - low) / 2;
            if(array[mid] > array[mid + 1] && array[mid] > array[mid - 1]) {

                return mid;

            }

            if(array[mid] > array[mid - 1]) {

                low = mid + 1;

            } else {

                high = mid - 1;

            }

        }

        return -1;

    }

}