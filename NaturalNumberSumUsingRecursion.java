package LearnTheBasics;

public class NaturalNumberSumUsingRecursion {

    public static void main(String[] args) {

        System.out.println(sumFirstN(5));

    }

    public static long sumFirstN(long n) {

        long sum = 0;

        return add(n, sum);

    }

    public static long add(long num, long sum) {

        if(num >= 1) {

            sum = sum + num;
            sum = add(num - 1, sum);

        }

        return sum;

    }

}