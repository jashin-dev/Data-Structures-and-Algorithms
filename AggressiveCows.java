package BinarySearchPractice;

import java.util.Scanner;

public class AggressiveCows {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int arraySize = input.nextInt();
        int cows = input.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int[] stalls = new int[arraySize];
        for(int i = 0; i <= stalls.length - 1; i++) {

            stalls[i] = input.nextInt();
            max = Math.max(stalls[i], max);
            min = Math.min(stalls[i], min);

        }

        for(int n = 0; n <= stalls.length - 1; n++) {

            for(int m = n; m <= stalls.length - 1; m++) {

                if(stalls[m] < stalls[n]) {

                    int temp = stalls[m];
                    stalls[m] = stalls[n];
                    stalls[n] = temp;

                }

            }

        }

        System.out.println(minimumDistance(stalls, cows, max, min));

    }

    public static int minimumDistance(int[] positions, int cows, int maximum, int minimum) {

        int low = 1;
        int high = maximum - minimum;
        int answer = Integer.MIN_VALUE;

        while(low <= high) {

            int mid = low + (high - low) / 2;
            if(minimumDistancePossibility(positions, mid, cows)) {

                answer = Math.max(answer, mid);
                low = mid + 1;

            } else {

                high = mid - 1;

            }

        }

        return answer;

    }

    public static boolean minimumDistancePossibility(int[] array, int distance, int cows) {

        int cowsAlreadyPlaced = 1;
        int lastPosition = array[0];

        for(int j = 1; j <= array.length - 1; j++) {

            if((array[j] - lastPosition) >= distance) {

                cowsAlreadyPlaced++;
                lastPosition = array[j];

            }

            if(cowsAlreadyPlaced >= cows) {

                return true;

            }

        }

        return false;

    }

}