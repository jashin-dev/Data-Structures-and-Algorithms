package LearnTheBasics;
import java.util.Arrays;
import java.util.HashMap;

public class FrequencyOfArrayElementsUsingHashmap {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(countFrequency(6, 4, new int[] {1, 3, 4, 3, 4, 1})));

    }

    public static int[] countFrequency(int n, int x, int[] nums){

         int[] hashArray = new int[n];
         HashMap<Integer, Integer> hashMap = new HashMap<>();

         for(int i = 1; i <= n; i++) {

             hashMap.put(i, 0);

         }

         return calculation(n, nums, hashArray, hashMap);

    }

    public static int[] calculation(int length, int[] inputArray, int[] outputArray, HashMap<Integer, Integer> bridge) {

        for(int i = 0; i < inputArray.length; i++) {

            if(bridge.containsKey(inputArray[i])) {

                bridge.put(inputArray[i], bridge.get(inputArray[i]) + 1);

            }

        }

        for(int j = 1; j <= length; j++) {

            outputArray[j - 1] = bridge.get(j);

        }

        return outputArray;

    }

}