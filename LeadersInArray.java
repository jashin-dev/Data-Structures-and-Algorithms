package ArraysPractice;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {

    public static void main(String[] args) {

        System.out.println(superiorElements(new int[] {5, 4, 3}));

    }

    public static List<Integer> superiorElements(int[] a) {

        List<Integer> list = new ArrayList<>();
        int greatestElement = Integer.MIN_VALUE;
        for(int i = a.length - 1; i >= 0; i--) {

            if(a[i] > greatestElement) {

                list.add(a[i]);
                greatestElement = a[i];

            }

        }

        return list;

    }

}