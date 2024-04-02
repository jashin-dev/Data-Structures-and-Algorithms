package ArraysPractice;

public class LinearSearchInsideArray {

    public static void main(String[] args) {

        System.out.println(linearSearch(4, 2, new int[] {2,5,6,2}));

    }

    public static int linearSearch(int n, int num, int[] arr) {

        int flag = -1;
        for(int i = 0; i <= n - 1; i++) {

            if(arr[i] == num) {

                flag = i;
                break;

            }

        }

        return flag;

    }

}