package LearnTheBasics;

public class HighestCommonFactor {

    public static void main(String[] args) {

        System.out.println(calcGCD(81, 75));

    }

    public static int calcGCD(int n, int m) {

        while (n != m) {

            if (n > m) {

                n = n - m;

            } else {

                m = m - n;

            }

        }

        return n;

    }

}