package LearnBasicSorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfElements = input.nextInt();

        int[] array = new int[numberOfElements];

        for(int i = 0; i < array.length; i++) {

            array[i] = input.nextInt();

        }

        selectionSort(array);

        System.out.println(Arrays.toString(array));

    }

    public static void selectionSort(int[] inputArray) {

        for(int i = 0; i < inputArray.length; i++) {

            int mini = i;
            int didSwap = 0;

            for(int j = i; j < inputArray.length; j++) {

             if(inputArray[j] < inputArray[mini]) {

                 swap(inputArray, j, mini);
                 didSwap = 1;

             }

            }

            if(didSwap == 0 && i == inputArray.length - 2) {

                break;

            }

        }

    }

    public static void swap(int[] arr, int index1, int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

}