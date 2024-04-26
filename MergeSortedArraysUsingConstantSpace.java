package ArraysPractice;

import java.util.Arrays;

public class MergeSortedArraysUsingConstantSpace {

    public static void main(String[] args) {

        int[] array1 = {1,2,3,0,0,0};
        int[] array2 = {2,5,6};
        merge(array1, 3, array2, array2.length);

        System.out.println(Arrays.toString(array1));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int pointer1 = m - 1;
        int pointer2 = n - 1;
        int pointerMerge = nums1.length - 1;

        while(pointer2 >= 0) {

            if(pointer1 >= 0 && nums2[pointer2] < nums1[pointer1]) {

                nums1[pointerMerge] = nums1[pointer1];
                pointer1--;
                pointerMerge--;

            } else {

                nums1[pointerMerge] = nums2[pointer2];
                pointerMerge--;
                pointer2--;

            }

        }

    }

}