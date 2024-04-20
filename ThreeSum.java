package ArraysPractice;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {

        for(List<Integer> test : threeSum(new int[] {0,0,0})) {

            System.out.println(test);

        }

    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> answer = new ArrayList<>();
        for(int n = 0; n <= nums.length - 1; n++) {

            for(int m = n; m <= nums.length - 1; m++) {

                if(nums[m] < nums[n]) {

                    int temp = nums[m];
                    nums[m] = nums[n];
                    nums[n] = temp;

                }

            }

        }

        for(int i = 0; i <= nums.length - 1; i++) {

            if(i > 0 && nums[i - 1] == nums[i]) {

                continue;

            }

            int j = i + 1;
            int k = nums.length - 1;

            while(j < k) {

                if(nums[i] + nums[j] + nums[k] == 0) {

                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);

                    answer.add(temp);
                    j++;
                    k--;

                    while(j < k && nums[j - 1] == nums[j]) {

                        j++;

                    }

                    while(k > j && nums[k + 1] == nums[k]) {

                        k--;

                    }

                } else if(nums[i] + nums[j] + nums[k] > 0) {

                    k--;

                } else {

                    j++;

                }

            }

        }

        return answer;

    }

}