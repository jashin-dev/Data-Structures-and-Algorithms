package ArraysPractice;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {

        System.out.println(generate(5));

    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<>();
        for(int i = 1; i <= numRows; i++) {

            list.add(generateRow(i));

        }

        return list;

    }

    public static List<Integer> generateRow(int rows) {

        List<Integer> temp = new ArrayList<>();
        int res = 1;
        temp.add(res);

        for(int j = 1; j <= rows - 1; j++) {

            res = res * (rows - j);
            res = res / j;
            temp.add(res);

        }

        return temp;

    }

}