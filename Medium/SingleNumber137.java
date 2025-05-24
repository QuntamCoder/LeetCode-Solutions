package Medium;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber137 {
    public int singleNumber(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for (int i : nums) {
        map.put(i, map.getOrDefault(i, 0)+1);
        
       }
       for(Map.Entry<Integer,Integer>  entry:map.entrySet()){
        if(entry.getValue()==1){
            return entry.getKey();
        }
       }

        
        return 0;
    }
    public static void main(String[] args) {
        SingleNumber137 aa=new SingleNumber137();
        int arr[]={2,2,3,2};
        int res=aa.singleNumber(arr);
        System.out.println(res);
    }
}
