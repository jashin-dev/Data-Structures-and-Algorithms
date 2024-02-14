package LearnTheBasics;

public class CheckForPrime {

    public static void main(String[] args) {

        System.out.println(isPrime(894));

    }


    public static String isPrime(int num) {


        if(num == 1) {

            return "NO";

        }

        for(int i = 1; i <= num; i++) {

            if(num % i == 0 && i != 1 && i != num) {

                return "NO";

            }

        }

        return "YES";

    }

}