package ArraysPractice;

import java.util.HashMap;

public class MaxNumberOfSubarrayOfSumEqualsK {

    public static void main(String[] args) {

        System.out.println(subarraySum(new int[] {1,2,3}, 3));

    }

    public static int subarraySum(int[] nums, int k) {

        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, 1);

        for(int i = 0; i <= nums.length - 1; i++) {

            sum = sum + nums[i];
            int remainingSum = sum - k;
            if(hashMap.containsKey(remainingSum)) {

                count = count + hashMap.get(remainingSum);

            }

            hashMap.put(sum, hashMap.getOrDefault(sum, 0) + 1);

        }

        return count;

    }

}