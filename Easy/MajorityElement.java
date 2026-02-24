import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
        public static int  majorityElement(int[] nums) {
         HashMap<Integer,Integer> map=new HashMap<>();
         for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
         }
         int max=0;
         int num=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                num=entry.getKey();
            }
        }
        
        return num;

    }
public static void main(String[] args) {
    System.out.println(majorityElement(new int[]{2,3,2,3,3}));
}
}
