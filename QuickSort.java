package LearnBasicSorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] testArray = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        quickSort(testArray, 0, testArray.length - 1);

        System.out.println(Arrays.toString(testArray));

    }

    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);

        }

    }

    public static int partition(int[] arr, int low, int high) {

        int i = low;
        int j = high;

        while(i < j) {

            while(arr[i] <= arr[low] && i <= high - 1) {

                i++;

            }

            while(arr[j] > arr[low]) {

                j--;

            }

            if(i < j) {

                swap(arr, i, j);

            }

        }

        swap(arr, low, j);

        return j;

    }

    public static void swap(int[] arr, int index1, int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

}