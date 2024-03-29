package ArraysPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateAnArrayTowardsLeft {

    public static void main(String[] args) {

        ArrayList<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);

        System.out.println(Arrays.toString(rotateArray(test, 2).toArray()));

    }

    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {

        int breakpoint = k - 1;
        reverse(arr, 0, breakpoint);
        reverse(arr, breakpoint + 1, arr.size() - 1);
        reverse(arr, 0, arr.size() - 1);

        return arr;

    }

    public static void reverse(ArrayList<Integer> list, int start, int stop) {

        int i = start;
        int j = stop;

        while(i < j) {

            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);

            i++;
            j--;

        }

    }

}