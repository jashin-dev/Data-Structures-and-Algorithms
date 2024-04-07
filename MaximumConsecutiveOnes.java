package ArraysPractice;

public class MaximumConsecutiveOnes {

    public static void main(String[] args) {

        System.out.println(findMaxConsecutiveOnes(new int[] {1,0,1,1,0,1}));

    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int temp = 0;
        for(int i = 0; i <= nums.length - 1; i++) {

            if(nums[i] == 1) {

                temp = 0;

                for(int j = i; j <= nums.length - 1; j++) {

                    if(nums[j] == 1) {

                        temp++;

                    } else {

                        break;

                    }

                }

                if(temp > count) {

                    count = temp;

                }

            }

        }

        return count;

    }

}