package BinarySearchPractice;

public class KokoEatingBananas {

    public static void main(String[] args) {

        System.out.println(minEatingSpeed(new int[] {805306368,805306368,805306368}, 1000000000));

    }

    public static int minEatingSpeed(int[] piles, int h) {

        int maximum = Integer.MIN_VALUE;
        for(int j = 0; j <= piles.length - 1; j++) {

            maximum = Math.max(maximum, piles[j]);

        }

        return binarySearch(piles, maximum, h);

    }

    public static int binarySearch(int[] array, int maxElement, int target) {

        int low = 1;
        int high = maxElement;
        int answer = Integer.MAX_VALUE;

        while(low <= high) {

            int mid = low + (high - low) / 2;
            if(calculatedTime(array, mid) <= target) {

                answer = Math.min(answer, mid);
                high = mid - 1;

            } else {

                low = mid + 1;

            }

        }

        return answer;

    }

    public static long calculatedTime(int[] arr, int rate) {

        long totalHours = 0;

        for(int i = 0; i <= arr.length - 1; i++) {

            totalHours = totalHours + (long) Math.ceil((double) arr[i] / rate);

        }

        return totalHours;

    }

}