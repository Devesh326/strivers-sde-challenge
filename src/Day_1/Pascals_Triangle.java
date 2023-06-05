package Day_1;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp;
        List<Integer> prev = new ArrayList<>();

        for(int i=0; i<numRows; i++){
            temp = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i) temp.add(1);
                else
                    temp.add(prev.get(j-1)+prev.get(j));
            }
            prev = temp;
            ans.add(prev);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(generate(5));
//        System.out.println();
    }
}
