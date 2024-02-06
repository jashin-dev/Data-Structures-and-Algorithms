package LearnTheBasics;

public class CountDigits {

    public static void main(String[] args) {

        System.out.println(countDigits(373));

    }

    public static int countDigits(int n){

        int counter = 0;
        int number = n;
        while(n != 0) {

        int digit = n % 10;

        if(digit > 0 && number % digit == 0) {

            counter++;

        }

        n = n / 10;

        }

        return counter;

    }

}