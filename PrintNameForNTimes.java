package LearnTheBasics;
import java.util.ArrayList;
import java.util.List;

public class PrintNameForNTimes {

    public static void main(String[] args) {

        System.out.println(printNTimes(5));

    }

    public static List<String> printNTimes(int n){

        List<String> series = new ArrayList<>();
        return printName(n, series);

    }

    public static List<String> printName(int num, List<String> series2) {

     if(num > 0) {

         series2.add("Coding Ninjas");
         printName(num - 1, series2);

     }

        return series2;
    }

}