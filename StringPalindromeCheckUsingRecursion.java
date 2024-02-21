package LearnTheBasics;

public class StringPalindromeCheckUsingRecursion {

    public static void main(String[] args) {

        System.out.println(isPalindrome("ABBA"));

    }

    public static boolean isPalindrome(String str) {

        int i = 0;

        return bridge(str, i);

    }

    public static boolean bridge(String str, int index) {

        if(index >= str.length() / 2) {

            return true;

        }


        if(str.charAt(index) != str.charAt( str.length() - 1 - index) ) {

            return false;

        }

     return bridge(str, index + 1);

    }

}