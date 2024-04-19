package ArraysPractice;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementNupon3Times {

    public static void main(String[] args) {

        System.out.println(majorityElement(new int[] {1,2}));

    }

    public static List<Integer> majorityElement(int[] nums) {

        List<Integer> list = new ArrayList<>();
        int count1 = 0;
        int element1 = Integer.MIN_VALUE;

        int count2 = 0;
        int element2 = Integer.MIN_VALUE;

        for(int i = 0; i <= nums.length - 1; i++) {

            if(count1 == 0 && nums[i] != element2) {

                element1 = nums[i];
                count1++;

            } else if(count2 == 0 && nums[i] != element1) {

                element2 = nums[i];
                count2++;

            } else if(nums[i] == element1) {

                count1++;

            } else if(nums[i] == element2) {

                count2++;

            } else {

                count1--;
                count2--;

            }

        }

        int flag1 = 0;
        int flag2 = 0;

        for(int j = 0; j <= nums.length - 1; j++) {

            if(nums[j] == element1) {

                flag1++;

            } else if(nums[j] == element2) {

                flag2++;

            }

        }

        if(flag1 > (nums.length / 3)) {

            list.add(element1);

        }

        if(flag2 > (nums.length / 3)) {

            list.add(element2);

        }

        if(list.size() == 2 && (list.get(0) > list.get(1)) ) {

            int temp = list.get(0);
            list.set(0, list.get(1));
            list.set(1, temp);

        }

        return list;

    }

}