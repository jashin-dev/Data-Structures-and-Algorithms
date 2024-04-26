package ArraysPractice;

import java.util.ArrayList;

public class CountInversionsInAnArray {

    public static void main(String[] args) {

        System.out.println(numberOfInversions(new int[] {5, 3, 2, 1, 4}, 5));

    }

    public static int numberOfInversions(int[] a, int n) {

        return mergeSort(a, 0, a.length - 1);

    }

    public static int mergeSort(int [] arr, int low, int high) {

        int count = 0;

        if(low == high) {

            return count;

        }

        int mid = (low + high) / 2;

        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += merge(arr, low, mid, high);

        return count;

    }

    public static int merge(int[] array, int low, int mid, int high) {

        int count2 = 0;

        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high) {

            if(array[left] <= array[right]) {

                temp.add(array[left]);
                left++;

            } else {

                temp.add(array[right]);
                count2 = count2 + mid - left + 1;
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

        return count2;

    }

}