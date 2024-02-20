package LearnTheBasics;

import java.util.ArrayList;
import java.util.List;

public class FactorialUsingRecursion {

    public static void main(String[] args) {

        System.out.println(factorialNumbers(7));

    }

    public static List<Long> factorialNumbers(long n) {

        long counter = 1;
        List<Long> series = new ArrayList<>();

        return  factorial(n, counter, series);

    }

    public static List<Long> factorial(long num, long counter, List<Long> series) {

        long checkNum = check(counter);

    if( checkNum > num) {

        return series;

    }

    series.add(checkNum);

    return factorial(num, counter + 1, series);

    }

    public static long check(long counter) {

        if(counter == 1) {

            return 1;

        } else {

            return counter * check(counter - 1);

        }

    }

}