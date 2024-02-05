package LearnTheBasics;

import java.util.ArrayList;
import java.util.Scanner;

public class ForLoops {

    public static void main(String[] args) {

        ArrayList<Integer> series = new ArrayList<>();
        series.add(0,0);
        series.add(1, 1);
        series.add(2,1);

        Scanner input = new Scanner(System.in);
        int position = input.nextInt();

        if(position == 1 || position == 2) {

            System.out.println(series.get(position));

        } else if(position <= 0) {

            System.out.println(series.get(0));

        } else {

            for (int index = 3; index <= position; index++) {

                int value = series.get(index - 1) + series.get(index - 2);
                series.add(index, value);

            }

            System.out.println(series.get(position));

        }


    }

}