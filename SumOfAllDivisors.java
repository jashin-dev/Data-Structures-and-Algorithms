package LearnTheBasics;

public class SumOfAllDivisors {

    public static void main(String[] args) {

        System.out.println(sumOfAllDivisors(10));


    }

    public static int sumOfAllDivisors(int n){

        int num = 1;
        int sum = 0;

        while (num <= n) {

            int number = num;

            for(int i = 1; i <= num; i++) {

                if(number % i == 0) {

                    sum = sum + i;

                }

            }

            num++;
        }

        return sum;

    }

}