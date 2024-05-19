package BinarySearchPractice;

public class FindNthRootOfM {

    public static void main(String[] args) {

        System.out.println(NthRoot(6, 4096));

    }

    public static int NthRoot(int n, int m) {

        return binarySearch(n, m);

    }

    public static int binarySearch(int n, int m) {

        int low = 1;
        int high = m;
        int answer = -1;

        while(low <= high) {

            int mid = low + (high - low) / 2;
            long bridge = 1;

            for(int i = 1; i <= n; i++) {

                bridge = bridge * mid;
                if(bridge > m) {

                    break;

                }

            }

            if(bridge == m) {

                return mid;

            }

            if(bridge < m) {

                low = mid + 1;

            } else {

                high = mid - 1;

            }

        }

        return answer;

    }

}