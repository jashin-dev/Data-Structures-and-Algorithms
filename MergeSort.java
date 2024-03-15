package LearnBasicSorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] test = {9, 8, 7, 6, 5};
        mergeSort(test, 0, test.length - 1);

        System.out.println(Arrays.toString(test));

    }

    public static void mergeSort(int [] arr, int low, int high) {

        if(low == high) {

            return;

        }

        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);

    }

    public static void merge(int[] array, int low, int mid, int high) {

        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high) {

            if(array[left] <= array[right]) {

                temp.add(array[left]);
                left++;

            } else {

                temp.add(array[right]);
                right++;

            }

        }

        while(left <= mid) {

            temp.add(array[left]);
            left++;

        }

        while(right <= high) {

            temp.add(array[right]);
            right++;

        }

        for(int i  = low; i <= high; i++) {

            array[i] = temp.get(i - low);

        }

    }

}