package Medium;

import java.util.HashMap;
import java.util.Map;

public class TopKElement347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i : nums) {
            map.put(i, map.put(i, 0)+1);
        }
        int[] arr=new int[nums.length];
        int cnt=0;

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
              arr[cnt++]=entry.getValue();
        }
    }
}
