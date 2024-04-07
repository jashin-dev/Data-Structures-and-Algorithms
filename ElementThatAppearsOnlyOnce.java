package ArraysPractice;

import java.util.HashMap;
import java.util.Map;

public class ElementThatAppearsOnlyOnce {

    public static void main(String[] args) {

        System.out.println(getSingleElement(new int[] {1, 1, 2, 3, 3, 4, 4}));

    }

    public static int getSingleElement(int[] arr) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i <= arr.length - 1; i++) {

            if(hashMap.isEmpty()) {

                hashMap.put(arr[i], 1);

            } else if(hashMap.containsKey(arr[i])) {

                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);

            } else {

                hashMap.put(arr[i], 1);

            }

        }

        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {

            if (entry.getValue() == 1) {

                return entry.getKey();

            }

        }

        return -1;

    }

}