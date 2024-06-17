package BinarySearchPractice;

public class MinimizeMaxDistanceToGasStations {

    public static void main(String[] args) {

        System.out.println(minimiseMaxDistance(new int[] {1,2,3,4,5,6,7,8,9,10}, 1));

    }

    public static double minimiseMaxDistance(int[] arr, int K) {

        int limit = 0;
        for(int j = 0; j <= arr.length - 2; j++) {

            limit = Math.max(limit, arr[j + 1] - arr[j]);

        }

        return binarySearch(arr, K, limit);

    }

    public static double binarySearch(int[] array, int numberOfGasStations, int maxDiff) {

        double low = 0;
        double high = maxDiff;
        double answer = maxDiff;

        while(high - low > 1e-6) {

            double mid = low + (high - low) / 2;
            if(possiblePlacements(array, mid) <= numberOfGasStations) {

                high = mid;
                answer = Math.min(high, answer);

            } else {

                low = mid;

            }

        }

        return answer;

    }

    public static int possiblePlacements(int[] positions, double distance) {

        int gasStationPlaced = 0;
        int totalGasStationPlaced = 0;

        for(int i = 0; i <= positions.length - 2; i++) {

            double differenceBetweenConsecutiveStations = positions[i + 1] - positions[i];
            gasStationPlaced = (int) (differenceBetweenConsecutiveStations / distance);

            if(distance * (double) gasStationPlaced == differenceBetweenConsecutiveStations) {

                gasStationPlaced = gasStationPlaced - 1;

            }

            totalGasStationPlaced += gasStationPlaced;

        }

        return totalGasStationPlaced;

    }

}