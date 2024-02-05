package LearnTheBasics;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayListBasics {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // input in Multi-Dimensional Arraylist

        Scanner input = new Scanner(System.in);
        for (int index = 0; index < 3; index++) {

            list.add(new ArrayList<>());

            for (int index2 = 0; index2 < 3; index2++) {

                list.get(index).add(index2, input.nextInt());

            }

        }

        // output from Multi-Dimensional Arraylist

        for(ArrayList<Integer> arrList : list) {

            System.out.println(arrList);

        }

        for(int index = 0; index < 3; index++) {

            ArrayList<Integer> stored = list.get(index);

            for(int index2 = 0; index2 < 3; index2++) {

                System.out.println(stored.get(index2));

            }

        }

        System.out.println(list);

    }

}