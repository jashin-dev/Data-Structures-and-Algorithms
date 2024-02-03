package LearnTheBasics;

public class SwitchStatements {

    public static void main(String[] args) {

        System.out.println( areaSwitchCase(1, new double[]{3}));

    }


    public static double areaSwitchCase(int ch, double []a) {

        switch (ch) {

            case 1 :

                return 3.14159265359 * a[0] * a[0];

            case 2 :

                return a[0] * a[1];

            default :

                return 0.0;

        }

    }

}