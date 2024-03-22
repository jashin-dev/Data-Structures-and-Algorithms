package ArraysPractice;

public class CheckIfSortedAndRotated {

    public static void main(String[] args) {

        System.out.println(check(new int[] {1,2,3}));

    }

    public static boolean check(int[] nums) {

        int count = 0;

        for(int i = 0; i <= nums.length - 2; i++) {

            if(nums[i] > nums[i + 1]) {

                count++;

            }

        }

        if(count == 0) {

            return true;

        } else if(count > 1) {

            return false;

        } else {

            return nums[0] >= nums[nums.length - 1];

        }

    }

}