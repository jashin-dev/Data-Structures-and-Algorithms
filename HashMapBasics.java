package LearnTheBasics;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapBasics {

    public static void main(String[] args) {

        // ordered hashmap

        Scanner userInput = new Scanner(System.in);
        int arraySize = userInput.nextInt();

        int[] array = new int[arraySize];
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < array.length; i++) {

            array[i] = userInput.nextInt();

            if (hashMap.containsKey(array[i])) {

                hashMap.get(array[i]);
                hashMap.replace(array[i], hashMap.get(array[i]) + 1);

            } else {

                hashMap.put(array[i], 1);

            }

        }

        int checks = userInput.nextInt();
        for(int i = 0; i < checks; i++) {

            System.out.println(hashMap.get(userInput.nextInt()));

        }

    }

}