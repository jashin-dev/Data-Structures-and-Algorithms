package LearnBasicSorting;

import java.util.Arrays;

public class InsertionSortPractice {

    public static void main(String[] args) {

        int[] test = {1, 2, 6, 4, 3};
        insertionSort(test, 5);

        System.out.println(Arrays.toString(test));

    }

    public static void insertionSort(int[] arr, int size) {

        for(int m = 0; m < size; m++) {

            supportFunction(arr, m);

        }

    }

    public static int[] supportFunction(int[] inputArr,int j) {

        if(j == 0) {

            return inputArr;

        }

        if(inputArr[j - 1] > inputArr[j]) {

            swap(inputArr,j - 1, j);

        }

        return supportFunction(inputArr, j - 1);

    }

    public static void swap(int[] arr, int index1, int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

}