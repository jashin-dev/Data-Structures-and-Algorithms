package ArraysPractice;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementNupon2Times {

    public static void main(String[] args) {

        System.out.println(majorityElement(new int[] {2,2,1,1,1,2,2}));

    }

    public static int majorityElement(int[] nums) {

        int temp = nums.length / 2;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i <= nums.length - 1; i++) {

            if(hashMap.isEmpty()) {

                hashMap.put(nums[i], 1);

            } else if(hashMap.containsKey(nums[i])) {

                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);

            } else {

                hashMap.put(nums[i], 1);

            }

        }

        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {

            if(entry.getValue() > temp) {

                return entry.getKey();

            }

        }

        return 0;

    }

}