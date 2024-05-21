package BinarySearchPractice;

public class CapacityToShipPackagesWithinDDays {

    public static void main(String[] args) {

        System.out.println(shipWithinDays(new int[] {1,2,3,1,1}, 4));

    }

    public static int shipWithinDays(int[] weights, int days) {

        int totalSum = 0;
        int maxE = Integer.MIN_VALUE;
        for(int j = 0; j <= weights.length - 1; j++) {

            totalSum += weights[j];
            maxE = Math.max(weights[j], maxE);

        }

        return binarySearch(weights, days, totalSum, maxE);

    }

    public static int binarySearch(int[] array, int daysProvided, long maxLimit, int maxElement) {

        long low = maxElement;
        long high = maxLimit;
        long answer = Integer.MAX_VALUE;

        while(low <= high) {

            long mid = low + (high - low) / 2;
            if(daysCalculator(array, mid) <= daysProvided) {

                answer = Math.min(answer, mid);
                high = mid - 1;

            } else {

                low = mid + 1;

            }

        }

        return (int) answer;

    }

    public static int daysCalculator(int[] arr, long check) {

        int daysCalculated = 1;
        long sum = 0;

        for(int i = 0; i <= arr.length - 1; i++) {

            if((sum + arr[i]) <= check) {

                sum += arr[i];

            } else {

                sum = arr[i];
                daysCalculated++;

            }

        }

        return daysCalculated;

    }

}