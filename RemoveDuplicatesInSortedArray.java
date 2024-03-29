package ArraysPractice;

public class RemoveDuplicatesInSortedArray {

    public static void main(String[] args) {

        System.out.println(removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));

    }

    public static int removeDuplicates(int[] nums) {

        int j = 0;
        for(int i = 0; i <= nums.length - 1; i++) {

            if(nums[i] != nums[j]) {

                j++;
                nums[j] = nums[i];

            }

        }

        return j + 1;

    }

}