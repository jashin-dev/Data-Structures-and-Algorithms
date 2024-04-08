package ArraysPractice;

public class LongestSubArrayOfSumK {

    public static void main(String[] args) {

        System.out.println(longestSubArrayWithSumK(new int[] {2,2,4,1,2}, 2));

    }

    public static int longestSubArrayWithSumK(int[] a, long k) {

        long sum = 0;
        int maxLength = 0;
        int i = 0;
        int j = 0;

        while(i <= a.length - 1 && j <= a.length - 1) {

            sum = sum + a[j];

            while(sum > k && i <= a.length - 1) {

                sum = sum - a[i];
                i++;

            }

            if(sum == k) {

                int length = j - i + 1;
                if(length > maxLength) {

                    maxLength = length;

                }

            }

            j++;

        }

        return maxLength;

    }

}