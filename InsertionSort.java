package LearnBasicSorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfItems = input.nextInt();
        int[] array = new int[numberOfItems];

        for(int i = 0; i < array.length; i++) {

            array[i] = input.nextInt();

        }

        insertionSort(array);

        System.out.println(Arrays.toString(array));

    }

    public static void insertionSort(int[] inputArray) {

        for(int i = 0; i < inputArray.length; i++) {


            int j = i;

            while(j > 0 && inputArray[j] < inputArray[j - 1]) {

                swap(inputArray, j, j - 1);
                j--;

            }

        }

    }

    public static void swap(int[] arr, int index1, int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

}