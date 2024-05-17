package BinarySearchPractice;

public class FindOutNumberOfTimesArrayIsRotated {

    public static void main(String[] args) {

        System.out.println(findKRotation(new int[] {1,2,3,4,5}, 5));

    }

    public static int findKRotation(int[] arr, int n) {

        return binarySearch(arr, n);

    }

    public static int binarySearch(int[] array, int size) {

        int low = 0;
        int high = size - 1;
        int minimumElement = Integer.MAX_VALUE;
        int index = -1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(array[low] <= array[mid]) {

                if(array[low] < minimumElement) {

                    minimumElement = array[low];
                    index = low;

                }
                low = mid + 1;

            } else {

                if(array[mid] < minimumElement) {

                    minimumElement = array[mid];
                    index = mid;

                }
                high = mid - 1;

            }

        }

        return index;

    }

}