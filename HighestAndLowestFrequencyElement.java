package LearnTheBasics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HighestAndLowestFrequencyElement {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(getFrequencies(new int[] {10, 10, 10, 3, 3, 3})));

    }

    public static int[] getFrequencies(int[] v) {

        int[] result = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < v.length; i++) {

            if (hashMap.containsKey(v[i])) {

                hashMap.put(v[i], hashMap.get(v[i]) + 1);

            } else {

                hashMap.put(v[i], 1);

            }

        }

        int maxF = 1;
        int minF = Integer.MAX_VALUE;

        for (int i = 0; i < v.length; i++) {

            int frequency = hashMap.get(v[i]);
            if (frequency > maxF) {

                maxF = frequency;

            } else if (frequency < minF) {

                minF = frequency;

            }

        }

        HashMap<Integer, Integer> frequencyHashmap = new HashMap<>();

        frequencyHashmap.put(maxF, 1);
        frequencyHashmap.put(minF, 1);

        int maxFrequencyElement = Integer.MAX_VALUE;
        int minFrequencyElement = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {

            if (entry.getValue() == maxF) {

                if (entry.getKey() < maxFrequencyElement) {
                    maxFrequencyElement = entry.getKey();
                }

            }

            if (entry.getValue() == minF) {

                if (entry.getKey() < minFrequencyElement) {
                    minFrequencyElement = entry.getKey();
                }

            }

        }

        result[0] = maxFrequencyElement;
        result[1] = minFrequencyElement;

        return result;

    }

}