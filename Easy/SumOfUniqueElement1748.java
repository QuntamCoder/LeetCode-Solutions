package Easy;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElement1748 {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i : nums) {
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                sum+=entry.getKey();
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1};
     SumOfUniqueElement1748 aa=new SumOfUniqueElement1748();
     System.out.println(aa.sumOfUnique(arr));
     
    }
}
