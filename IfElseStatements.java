package LearnTheBasics;

public class IfElseStatements {

    public static void main(String[] args) {

        System.out.println(compareIfElse(67,6));

    }

    public static String compareIfElse(int a, int b) {

    if(a > b) {

    return "greater";

    } else if (a < b) {

      return "smaller";

    }

     return "equal";

    }

}