package Day_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Intervals {
    public static int[][] merge(int[][] intervals) {
        int end = intervals[0][1];

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        list.add(intervals[0][0]);
        list.add(intervals[0][1]);

        ans.add(list);


        for(int i=1; i<intervals.length; i++){
            list = new ArrayList<>();
            if(intervals[i][0] <= end){
                if(intervals[i][1] > end) {
                    ans.get(ans.size() - 1).remove(1);
                    ans.get(ans.size() - 1).add(intervals[i][1]);
                    end = intervals[i][1];
                }
            }
            else{
                list.add(intervals[i][0]);
                list.add(intervals[i][1]);

                ans.add(list);

                end = intervals[i][1];
            }

            System.out.println(ans);
        }

        return ans.stream()
                .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);
    }

    public static void main(String[] args) {
        int arr[][] = {{1,4},{2,3}, {8,10}, {7,9}};
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(merge(arr)));
    }
}
