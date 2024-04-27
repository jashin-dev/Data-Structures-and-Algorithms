package ArraysPractice;

import java.util.ArrayList;
import java.util.List;

public class ReversePairsInsideAnArray {

    public static void main(String[] args) {

        System.out.println(reversePairs(new int[] {2,4,3,5,1}));

    }

    public static int reversePairs(int[] nums) {

        return mergeSort(nums, 0, nums.length - 1);

    }

    public static int mergeSort(int[] arr, int low, int high) {

        int count = 0;
        if(low == high) {

            return count;

        }

        int mid = (low + high) / 2;

        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += counterOfReversePairs(arr, low, mid, high);
        merge(arr, low, mid, high);

        return count;

    }

    public static void merge(int[] array, int low, int mid, int high) {

        int left = low;
        int right = mid + 1;
        List<Integer> tempList = new ArrayList<>();

        while(left <= mid && right <= high) {

            if(array[left] > array[right]) {

                tempList.add(array[right]);
                right++;

            } else {

                tempList.add(array[left]);
                left++;

            }

        }

        while(left <= mid) {

            tempList.add(array[left]);
            left++;

        }

        while(right <= high) {

            tempList.add(array[right]);
            right++;

        }

        for(int i = low; i <= high; i++) {

            array[i] = tempList.get(i - low);

        }

    }

    public static int counterOfReversePairs(int[] arr, int low, int mid, int high) {

        int count2 = 0;
        int right = mid + 1;

        for(int j = low; j <= mid; j++) {

            while(right <= high && arr[j] > (long) (arr[right]) * 2) {

                right++;

            }

            count2 += right - (mid + 1);

        }

        return count2;

    }

}