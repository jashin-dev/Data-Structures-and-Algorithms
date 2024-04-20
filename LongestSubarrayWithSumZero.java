package ArraysPractice;

import java.util.HashMap;

public class LongestSubarrayWithSumZero {

    public static void main(String[] args) {

        System.out.println(getLongestZeroSumSubarrayLength(new int[] {1, 0, -1, 1}));

    }

    public static int getLongestZeroSumSubarrayLength(int[] arr) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int sum = 0;
        int maxLength = 0;

        for(int i = 0; i <= arr.length - 1; i++) {

            sum = sum + arr[i];
            if(sum == 0) {

                if(i + 1 > maxLength) {

                    maxLength = i + 1;

                }

            }

            if(hashMap.isEmpty()) {

                hashMap.put(sum, i);

            } else if(hashMap.containsKey(sum)) {

                if((i - hashMap.get(sum)) > maxLength) {

                    maxLength = (i - hashMap.get(sum));

                }

            } else {

                hashMap.put(sum, i);

            }

        }

        return maxLength;

    }

}