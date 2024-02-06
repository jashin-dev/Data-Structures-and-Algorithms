package LearnTheBasics;

public class ReverseANumber {

    public static void main(String[] args) {

        System.out.println(reverse(464351534));

    }

    public static int reverse(int x) {

        int number = x;
        long reversedNumber = 0;

        while (number != 0) {

            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;

            number = number / 10;

        }

        if(reversedNumber > Integer.MAX_VALUE || reversedNumber < Integer.MIN_VALUE) {

            return 0;

        }

        return (int) reversedNumber;

    }

}