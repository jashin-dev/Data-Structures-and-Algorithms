package BinarySearchPractice;

public class FindTheSmallestDivisor {

    public static void main(String[] args) {

        System.out.println(smallestDivisor(new int[] {44,22,33,11,1}, 5));

    }

    public static int smallestDivisor(int[] nums, int threshold) {

        int max = Integer.MIN_VALUE;
        for(int j = 0; j <= nums.length - 1; j++) {

            max = Math.max(nums[j], max);

        }

        return binarySearch(nums, threshold, max);

    }

    public static int binarySearch(int[] array, int threshold, int maxElement) {

        int low = 1;
        int high = maxElement;
        int answer = Integer.MAX_VALUE;

        if(array.length > threshold) {

            return -1;

        }

        while(low <= high) {

            int mid = low + (high - low) / 2;
            if(possibility(array, mid) <= threshold) {

                answer = Math.min(answer, mid);
                high = mid - 1;

            } else {

                low = mid + 1;

            }

        }

        return answer;

    }

    public static int possibility(int[] arr, int check) {

        int sum = 0;
        for(int i = 0; i <= arr.length - 1; i++) {

            sum += Math.ceil((double) arr[i] / check);

        }

        return sum;

    }

}