package ArraysPractice;

import java.util.Arrays;

public class SecondLargestAndSmallestElement {

    public static void main(String[] args) {

        int[] test = {3, 4, 5, 2};
        System.out.println(Arrays.toString(getSecondOrderElements(test.length, test)));

    }

    public static int[] getSecondOrderElements(int n, int[] a) {

        int[] result = new int[2];

        int smallestElement = a[0];
        int largestElement = a[0];
        int smallestElementIndex = 0;
        int largestElementIndex = 0;

        for(int i = 1; i < n; i++) {

            if(a[i] > largestElement) {

                largestElement = a[i];
                largestElementIndex = i;

            }

            if(a[i] < smallestElement) {

                smallestElement = a[i];
                smallestElementIndex = i;

            }

        }

        if(n > 2) {

            int secondLargestElement = Integer.MIN_VALUE;
            int secondSmallestElement = Integer.MAX_VALUE;

            for(int i = 0; i < n; i++) {

                if(a[i] > secondLargestElement && i != largestElementIndex) {

                    secondLargestElement = a[i];

                }

                if(a[i] < secondSmallestElement && i != smallestElementIndex) {

                    secondSmallestElement = a[i];

                }

            }

            result[0] = secondLargestElement;
            result[1] = secondSmallestElement;

        } else {

            result[0] = largestElement;
            result[1] = smallestElement;

        }

        return result;

    }

}