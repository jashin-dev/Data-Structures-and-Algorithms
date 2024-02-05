package LearnTheBasics;

import java.util.Scanner;

public class WhileLoops {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        while(number != 0) {

        int digit = number % 10;

        if(digit % 2 == 0) {

            evenSum = evenSum + digit;

        } else {

            oddSum = oddSum + digit;

        }

        number = number / 10;

        }

        System.out.println(evenSum + " " + oddSum);

    }

}