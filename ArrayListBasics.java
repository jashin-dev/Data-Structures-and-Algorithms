package LearnTheBasics;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBasics {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        // input for Arraylist

        for(int index = 0; index < 5; index++) {

            int num = input.nextInt();
            list.add(num);

        }

        // output from Arraylist

        System.out.println(list);

        for(int index = 0; index < 5; index++) {

            System.out.println(list.get(index));

        }

        System.out.println("Element at 3 is : " + list.get(3));

    }

}
