package BinarySearchPractice;

import java.util.ArrayList;

public class AllocateBooks {

    public static void main(String[] args) {

        ArrayList<Integer> test = new ArrayList<>();
        test.add(25);
        test.add(46);
        test.add(28);
        test.add(49);
        test.add(24);

        System.out.println(findPages(test, 5, 4));

    }

    public static int findPages(ArrayList<Integer> arr, int n, int m) {

        int sum = 0;
        int maxElement = Integer.MIN_VALUE;
        for(int i = 0; i <= n - 1; i++) {

            sum += arr.get(i);
            maxElement = Math.max(maxElement, arr.get(i));

        }

        return binarySearch(arr, sum, m, maxElement);

    }

    public static int binarySearch(ArrayList<Integer> array, int maxLimit, int students, int maximum) {

        if(array.size() < students) {

            return -1;

        }

        int low = maximum;
        int high = maxLimit;
        int answer = Integer.MAX_VALUE;

        while(low <= high) {

            int mid = low + (high - low) / 2;
            if(booksAllocator(array, mid, students)) {

                answer = Math.min(mid, answer);
                high = mid - 1;

            } else {

                low = mid + 1;

            }

        }

        return answer;

    }

    public static boolean booksAllocator(ArrayList<Integer> list, int pages, int students) {

        int studentNumber = 1;
        int totalPagesOfCurrentStudent = list.get(0);
        int maximumPages = list.get(0);

        for(int num = 1; num <= list.size() - 1; num++) {

            if(totalPagesOfCurrentStudent + list.get(num) <= pages) {

                totalPagesOfCurrentStudent += list.get(num);
                maximumPages = Math.max(maximumPages, totalPagesOfCurrentStudent);

            } else {

                studentNumber++;
                totalPagesOfCurrentStudent = list.get(num);
                maximumPages = Math.max(maximumPages, totalPagesOfCurrentStudent);

            }

        }

        return studentNumber <= students && maximumPages <= pages;

    }

}