package LearnTheBasics;

import java.util.Scanner;

public class HashArray {

    public static void main(String[] args) {

        // for numbers

        Scanner input = new Scanner(System.in);
        int numberOfInputs = input.nextInt();

        int[] numbers = new int[numberOfInputs];
        int[] hash = new int[13];
        for(int i = 0; i < numbers.length; i++) {

            numbers[i] = input.nextInt();
            hash[numbers[i]]++;

        }

        int numberOfQueries = input.nextInt();

        for(int i = 0; i < numberOfQueries; i++) {

            System.out.println(hash[input.nextInt()]);

        }

        // for characters

        Scanner inputCharacter = new Scanner(System.in);
        String inputString = inputCharacter.next();

        int[] hashArray = new int[256];

        for(int i = 0; i < inputString.length(); i++) {

            hashArray[inputString.charAt(i)]++;

        }

        int queries = inputCharacter.nextInt();

        for(int i = 0; i < queries; i++) {

            System.out.println(hashArray[inputCharacter.next().charAt(0)]);

        }

    }

}