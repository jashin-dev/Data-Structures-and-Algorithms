package ArraysPractice;

public class MaximumProductSubarray {

    public static void main(String[] args) {

        System.out.println(maxProduct(new int[] {-2,0,-1}));

    }

    public static int maxProduct(int[] nums) {

        int prefixProduct = 1;
        int suffixProduct = 1;
        int maxProduct = Integer.MIN_VALUE;

        for(int i = 0; i <= nums.length - 1; i++) {

            prefixProduct = prefixProduct * nums[i];
            suffixProduct = suffixProduct * nums[nums.length - 1 - i];

            maxProduct = Math.max(maxProduct, prefixProduct);
            maxProduct = Math.max(maxProduct, suffixProduct);

            if(prefixProduct == 0) {

                prefixProduct = 1;

            } else if(suffixProduct == 0) {

                suffixProduct = 1;

            }

        }

        return maxProduct;

    }

}