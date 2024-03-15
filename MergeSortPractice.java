package LearnBasicSorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortPractice {

    public static void main(String[] args) {

        int[] test = {9, 4, 15, 1, 3};
        mergeSort(test, 0, test.length - 1);

        System.out.println(Arrays.toString(test));

    }

    public static void mergeSort(int[] arr, int l, int r) {

        if( l == r) {

            return;

        }

        int mid = (l + r) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);

    }

    public static void merge(int[] array, int l, int mid, int r) {

        ArrayList<Integer> temp = new ArrayList<>();
        int left = l;
        int right = mid + 1;

        while(left <= mid && right <= r) {

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

        while(right <= r) {

            temp.add(array[right]);
            right++;

        }

        for(int i = l; i <= r; i++) {

            array[i] = temp.get(i - l);

        }

    }

}