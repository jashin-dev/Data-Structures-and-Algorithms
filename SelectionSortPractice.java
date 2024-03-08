package LearnBasicSorting;

import java.util.Arrays;

public class SelectionSortPractice {

    public static void main(String[] args) {

        int[] testArray = {1, 2, 4, 3, 6};

        selectionSort(testArray);

        System.out.println(Arrays.toString(testArray));

    }

    public static void selectionSort(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++) {

            int didSwap = 0;

            for(int j = i; j < arr.length; j++) {

                if(arr[j] < arr[i]) {

                    swap(arr, i, j);
                    didSwap = 1;

                }

            }

            if(didSwap == 0 && i == arr.length - 2) {

                break;

            }

        }

    }

    public static void swap(int[] inputArray, int index1, int index2) {

        int temp = inputArray[index1];
        inputArray[index1] = inputArray[index2];
        inputArray[index2] = temp;

    }

}