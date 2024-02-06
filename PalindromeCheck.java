package LearnTheBasics;

public class PalindromeCheck {

    public static void main(String[] args) {

        System.out.println(isPalindrome(1214));

    }

    public static boolean isPalindrome(int x) {

        int numberCheck = x;
        int number = x;
        int reversedNumber = 0;

        if (number < 0) {

            return false;

        }

        while (number != 0) {

            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;

            number = number / 10;

        }

        return numberCheck == reversedNumber;

    }

}