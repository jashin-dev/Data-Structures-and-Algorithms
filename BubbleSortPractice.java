package LearnBasicSorting;

import java.util.Arrays;

public class BubbleSortPractice {

    public static void main(String[] args) {

        int[] testArray = {16, 12, 4, 1, 33};
        bubbleSort(testArray, 5);

        System.out.println(Arrays.toString(testArray));

    }

    public static void bubbleSort(int[] arr, int n) {

        for(int i = n - 1; i > 0; i--) {

            int didSwap = 0;

            for(int j = 0; j < i; j++) {

                if(arr[j] > arr[i]) {

                    swap(arr, i, j);
                    didSwap = 1;

                }

            }

            if(didSwap == 0 && i == 1) {

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