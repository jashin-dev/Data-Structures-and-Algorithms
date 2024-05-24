package BinarySearchPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class PainterPartitionProblem {

    public static void main(String[] args) {

        ArrayList<Integer> test = new ArrayList<>(Arrays.asList(2, 1, 5, 6, 2, 3));
        System.out.println(findLargestMinDistance(test, 2));

    }

    public static int findLargestMinDistance(ArrayList<Integer> boards, int k) {

        int maxE = Integer.MIN_VALUE;
        int maximumLimit = 0;
        for(int number : boards) {

            maxE = Math.max(maxE, number);
            maximumLimit += number;

        }

        return binarySearch(boards, k, maxE, maximumLimit);

    }

    public static int binarySearch(ArrayList<Integer> arrayList, int painters, int maximumElement, int sum) {

        int low = maximumElement;
        int high = sum;
        int answer = Integer.MAX_VALUE;

        while(low <= high) {

            int mid = low + (high - low) / 2;
            if(timeCheck(arrayList, painters, mid)) {

                answer = Math.min(mid, answer);
                high = mid - 1;

            } else {

                low = mid + 1;

            }

        }

        return answer;

    }

    public static boolean timeCheck(ArrayList<Integer> list, int painters, int time) {

        int painterNumber = 1;
        int timeTakenByCurrentPainter = list.get(0);
        int maxTimeTillNow = Integer.MIN_VALUE;

        for(int n = 1; n <= list.size() - 1; n++) {

            if(timeTakenByCurrentPainter + list.get(n) <= time) {

                timeTakenByCurrentPainter += list.get(n);
                maxTimeTillNow = Math.max(maxTimeTillNow, timeTakenByCurrentPainter);

            } else {

                painterNumber++;
                timeTakenByCurrentPainter = list.get(n);
                maxTimeTillNow = Math.max(maxTimeTillNow, timeTakenByCurrentPainter);

            }

        }

        return ((painterNumber <= painters) && (maxTimeTillNow <= time) );

    }

}