package ArraysPractice;

public class FindTheMissingNumber {

    public static void main(String[] args) {

        System.out.println(missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));

    }

    public static int missingNumber(int[] nums) {

        int totalSum = (nums.length*(nums.length + 1)) / 2;
        int calculatedSum = 0;

        for(int i = 0; i <= nums.length - 1; i++) {

            calculatedSum = calculatedSum + nums[i];

        }

        return totalSum - calculatedSum;

    }

}