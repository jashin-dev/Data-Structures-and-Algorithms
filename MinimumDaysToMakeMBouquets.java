package BinarySearchPractice;

public class MinimumDaysToMakeMBouquets {

    public static void main(String[] args) {

        System.out.println(minDays(new int[] {7,7,7,7,12,7,7}, 2,3));

    }

    public static int minDays(int[] bloomDay, int m, int k) {

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for(int j = 0; j <= bloomDay.length - 1; j++) {

            maximum = Math.max(bloomDay[j], maximum);
            minimum = Math.min(bloomDay[j], minimum);

        }

        return binarySearch(bloomDay, m, k, minimum, maximum);

    }

    public static int binarySearch(int[] array, int bouquetsToBeMade, int consecutiveFlowers, int min, int max) {

        int low = min;
        int high = max;
        int answer = Integer.MAX_VALUE;
        long maxFlowers = array.length;

        if(((long) bouquetsToBeMade * (long) consecutiveFlowers) > maxFlowers) {

            return -1;

        }

        while(low <= high) {

            int mid = low + (high - low) / 2;
            if(possibility(array, bouquetsToBeMade, consecutiveFlowers, mid)) {

                answer = Math.min(answer, mid);
                high = mid - 1;

            } else {

                low = mid + 1;

            }

        }

        return answer;

    }

    public static boolean possibility(int[] arr, int bouquetsToBeMade, int consecutiveFlowers, int check) {

        int totalBouquets = 0;
        int count = 0;

        for(int i = 0; i <= arr.length - 1; i++) {

            if(arr[i] <= check) {

                count++;

            } else {

                totalBouquets += count / consecutiveFlowers;
                count = 0;

            }

        }

        totalBouquets += count / consecutiveFlowers;

        return totalBouquets >= bouquetsToBeMade;

    }

}