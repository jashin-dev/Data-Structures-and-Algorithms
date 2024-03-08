package LearnBasicSorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfItems = input.nextInt();
        int[] array = new int[numberOfItems];

        for(int i = 0; i < array.length; i++) {

            array[i] = input.nextInt();

        }

        bubbleSort(array);

        System.out.println(Arrays.toString(array));

    }

    public static void bubbleSort(int[] inputArray) {

        for(int i = inputArray.length - 1; i >= 1; i--) {

            int didSwap = 0;

            for(int j = 0; j < i; j++) {

                if(inputArray[j] > inputArray[i]) {

                    swap(inputArray, j, i);
                    didSwap = 1;

                }

            }

            if(didSwap == 0 && i == 1) {

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