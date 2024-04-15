package ArraysPractice;

public class LongestSuccessiveSequence {

    public static void main(String[] args) {

        System.out.println(longestSuccessiveElements(new int[] {15, 6, 2, 1, 16, 4, 2, 29, 9, 12, 8, 5, 14, 21, 8, 12, 17, 16, 6, 26, 3}));

    }

    public static int longestSuccessiveElements(int[] a) {

        for(int i = 0; i <= a.length - 1; i++) {

            for(int j = i; j <= a.length - 1; j++) {

                if(a[j] < a[i]) {

                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }

            }

        }

        int maxLength = 0;
        int length = 0;
        for(int k = 0; k <= a.length - 2; k++) {

            if(a[k + 1] - a[k] == 1) {

                length++;
                if(length > maxLength) {

                    maxLength = length;

                }

            } else if(a[k + 1] - a[k] == 0) {

                continue;

            } else {

                length = 0;

            }

        }

        return maxLength > 0 ? maxLength + 1 : 0;

    }

}