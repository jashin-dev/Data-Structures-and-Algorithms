package LearnBasicSorting;

import java.util.Arrays;

public class QuickSortPractice {

    public static void main(String[] args) {

        int[] array = {8, 3, 9, 4, 5};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

    }

    public static void quickSort(int[] input, int startIndex, int endIndex) {

        if(startIndex < endIndex) {

            int partitionIndex = partition(input, startIndex, endIndex);

            quickSort(input, startIndex, partitionIndex - 1);
            quickSort(input, partitionIndex + 1, endIndex);

        }

    }

    public static int partition(int[] input, int low, int high) {

        int i = low;
        int j = high;

        while(i < j) {

            while(input[i] <= input[low] && i <= high - 1) {

                i++;

            }

            while(input[j] > input[low] && j >= low + 1) {

                j--;

            }

            if(i < j) {

                swap(input, i, j);

            }

        }

        swap(input, low, j);

        return j;

    }

    public static void swap(int[] input, int index1, int index2) {

        int temp = input[index1];
        input[index1] = input[index2];
        input[index2] = temp;

    }

}