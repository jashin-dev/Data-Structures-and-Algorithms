package BinarySearchPractice;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {

        System.out.println(findMedianSortedArrays(new int[] {1,2}, new int[] {3,4}));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        return binarySearch(nums1, nums2);

    }

    public static double binarySearch(int[] a, int[] b) {

        int n1 = a.length;
        int n2 = b.length;
        if(n1 > n2) return binarySearch(b, a);

        int total = n1 + n2;
        int left = (n1 + n2 + 1) / 2;
        int low = 0;
        int high = n1;

        while(low <= high) {

            int mid1 = low + (high - low) / 2;
            int mid2 = left - mid1;

            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;

            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;

            if(mid1 - 1 >= 0) l1 = a[mid1 - 1];
            if(mid2 - 1 >= 0) l2 = b[mid2 - 1];

            if(mid1 < n1) r1 = a[mid1];
            if(mid2 < n2) r2 = b[mid2];

            if(l1 <= r2 && l2 <= r1) {

                if(total % 2 == 0) return (double) (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                else return Math.max(l1, l2);

            } else if(l1 > r2) {

                high = mid1 - 1;

            } else low = mid1 + 1;

        }

        return 0.0;

    }

}