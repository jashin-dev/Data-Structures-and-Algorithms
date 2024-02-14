package LearnTheBasics;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    int number2 = number;
    int number3 = number;

    int digitCount = 0;
    int sumCheck = 0;

    while(number != 0) {

        digitCount++;

        number = number / 10;

    }

    for(int i = 0; i < digitCount; i++) {

        int digit = number2 % 10;

        int square = 1;

        for(int j = 0; j < digitCount; j++) {

            square = square * digit;

        }

        sumCheck = sumCheck + square;
        number2 = number2 / 10;

    }

    if(sumCheck == number3) {

        System.out.println("true");

    } else {

        System.out.println("false");

    }

    }

}