package LearnTheBasics;

import java.util.Scanner;

public class UserInputOutput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char inputCharacter = input.next().charAt(0);

        if(Character.isUpperCase(inputCharacter)) {

            System.out.println("1");

        } else if (Character.isLowerCase(inputCharacter)) {

            System.out.println("0");

        } else if (!(Character.isAlphabetic(inputCharacter))){

            System.out.println("-1");

        }

    }

}