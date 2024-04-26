package ArraysPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {

    public static void main(String[] args) {

        for(int[] array : merge(new int[][] {{2,3}, {4,5}, {6,7}, {8,9}, {1,10}})) {

            System.out.println(Arrays.toString(array));

        }

    }

    public static int[][] merge(int[][] intervals) {

        for(int i = 0; i <= intervals.length - 1; i++) {

            for(int j = i; j <= intervals.length - 1; j++) {

                if(intervals[j][0] < intervals[i][0]) {

                    int temp = intervals[j][0];
                    intervals[j][0] = intervals[i][0];
                    intervals[i][0] = temp;

                    int temp2 = intervals[j][1];
                    intervals[j][1] = intervals[i][1];
                    intervals[i][1] = temp2;

                } else if(intervals[j][0] == intervals[i][0] && intervals[j][1] < intervals[i][1]) {

                    int temp3 = intervals[j][1];
                    intervals[j][1] = intervals[i][1];
                    intervals[i][1] = temp3;

                }

            }

        }

        List<List<Integer>> list = new ArrayList<>();

        for(int n = 0; n <= intervals.length - 1; n++) {

            if(n == 0) {

                List<Integer> tempList = new ArrayList<>();
                tempList.add(intervals[n][0]);
                tempList.add(intervals[n][1]);

                list.add(tempList);

            } else {

                List<Integer> check = list.get(list.size() - 1);

                if(intervals[n][0] > check.get(1)) {

                    List<Integer> temporaryList = new ArrayList<>();
                    temporaryList.add(intervals[n][0]);
                    temporaryList.add(intervals[n][1]);

                    list.add(temporaryList);

                } else if(intervals[n][0] <= check.get(1) && intervals[n][1] > check.get(1)) {

                    List<Integer> tempList2 = list.get(list.size() - 1);
                    tempList2.set(1, intervals[n][1]);
                    list.set(list.size() - 1, tempList2);

                }

            }

        }

        int[][] answer = new int[list.size()][2];
        for(int num = 0; num <= answer.length - 1; num++) {

            List<Integer> bridge = list.get(num);
            answer[num][0] = bridge.get(0);
            answer[num][1] = bridge.get(1);

        }

        return answer;

    }

}