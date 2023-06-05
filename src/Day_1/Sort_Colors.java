package Day_1;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Sort_Colors {
    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};

        Map<Integer, Integer> map = new TreeMap<>();

        for(int i: nums)
            map.put(i, map.getOrDefault(i, 0)+1);

        int k=0;
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(k>=nums.length) break;
            for(int i=0 ; i<e.getValue(); i++)
                nums[k++] = e.getKey();
        }

        System.out.println(Arrays.toString(nums));
    }
}
