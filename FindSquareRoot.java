package BinarySearchPractice;

public class FindSquareRoot {

    public static void main(String[] args) {

        System.out.println(floorSqrt(24));

    }

    public static long floorSqrt(long x) {

        return binarySearch(x);

    }

    public static long binarySearch(long target) {

        long low = 1;
        long high = target;
        long answer = 1;

        while(low <= high) {

            long mid = low + (high - low) / 2;
            if(mid*mid <= target) {

                answer = mid;
                low = mid + 1;

            } else {

                high = mid - 1;

            }

        }

        return answer;

    }

}