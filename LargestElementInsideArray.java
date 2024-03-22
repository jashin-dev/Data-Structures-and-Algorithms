package ArraysPractice;

public class LargestElementInsideArray {

    public static void main(String[] args) {

        int[] test = {1, 2, 3, 4, 5};
        System.out.println(largestElement(test, test.length));

    }

    static int largestElement(int[] arr, int n) {

        int element = arr[0];

        for(int i = 1; i <= n - 1; i++) {

            if(arr[i] > element) {

                element = arr[i];

            }

        }

        return element;

    }

}