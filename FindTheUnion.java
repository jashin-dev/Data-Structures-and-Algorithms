package ArraysPractice;

import java.util.ArrayList;
import java.util.List;

public class FindTheUnion {

    public static void main(String[] args) {

        System.out.println(sortedArray(new int[] {1, 2, 3, 3}, new int[] {2, 2, 4}));

    }

    public static List<Integer> sortedArray(int[] a, int[] b) {

        List<Integer> myList = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i <= a.length - 1 && j <= b.length - 1) {

            if(a[i] < b[j]) {

                if(!(myList.contains(a[i]))) {

                    myList.add(a[i]);

                }

                i++;

            } else if(a[i] > b[j]) {

                if(!(myList.contains(b[j]))) {

                    myList.add(b[j]);

                }

                j++;

            } else {

                if(!(myList.contains(a[i]))) {

                    myList.add(a[i]);

                }

                i++;
                j++;

            }

        }

        while(i <= a.length - 1) {

            if(!(myList.contains(a[i]))) {

                myList.add(a[i]);

            }

            i++;

        }

        while(j <= b.length - 1) {

            if(!(myList.contains(b[j]))) {

                myList.add(b[j]);

            }

            j++;

        }

        return myList;

    }

}