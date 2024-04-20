package ArraysPractice;

import java.util.ArrayList;
import java.util.List;

public class FourSum {

    public static void main(String[] args) {

        for(List<Integer> test : fourSum(new int[] {1000000000,1000000000,1000000000,1000000000}, -294967296)) {

            System.out.println(test);

        }

    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> answer = new ArrayList<>();
        for(int n = 0; n <= nums.length - 1; n++) {

            for(int m = n; m <= nums.length - 1; m++) {

                if(nums[m] < nums[n]) {

                    int temp = nums[n];
                    nums[n] = nums[m];
                    nums[m] = temp;

                }

            }

        }

        for(int i = 0; i <= nums.length - 1; i++) {

            if(i > 0 && nums[i - 1] == nums[i]) {

                continue;

            }

            for(int j = i + 1; j <= nums.length - 1; j++) {

                if(j > i + 1 && nums[j - 1] == nums[j]) {

                    continue;

                }

                int k = j + 1;
                int l = nums.length - 1;

                while(k < l) {

                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];


                    if(sum == target) {

                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        answer.add(temp);

                        k++;
                        l--;

                        while(k < l && nums[k - 1] == nums[k]) {

                            k++;

                        }

                        while(l > k && nums[l + 1] == nums[l]) {

                            l--;

                        }

                    } else if(sum > target) {

                        l--;

                    } else {

                        k++;

                    }

                }

            }

        }

        return answer;

    }

}