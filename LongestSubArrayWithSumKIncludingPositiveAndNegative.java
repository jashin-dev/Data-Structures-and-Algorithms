package ArraysPractice;

import java.util.HashMap;

public class LongestSubArrayWithSumKIncludingPositiveAndNegative {

    public static void main(String[] args) {

        System.out.println(getLongestSubarray(new int[] {-1, 0, 1, 1, -1, -1, 0}, 0));

    }

    public static int getLongestSubarray(int[] nums, int k) {

        int sum = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i <= nums.length - 1; i++) {

            sum = sum + nums[i];
            if(hashMap.isEmpty()) {

                hashMap.put(sum, i);

            } else if(!(hashMap.containsKey(sum))) {

                hashMap.put(sum, i);

            }

            int remainingSum = sum - k;
            if(hashMap.containsKey(remainingSum)) {

                int length = i - hashMap.get(remainingSum);
                if(length > maxLength) {

                    maxLength = length;

                }

            }

            if(sum == k) {

                int tempLength = i + 1;
                if(tempLength > maxLength) {

                    maxLength = tempLength;

                }

            }

        }

        return maxLength;

    }

}