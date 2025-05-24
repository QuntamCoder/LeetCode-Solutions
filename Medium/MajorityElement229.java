package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement229 {
        public List<Integer> majorityElement(int[] nums) {
            HashMap<Integer,Integer> map=new HashMap<>();
            List<Integer> list=new ArrayList<>();

            for (int i : nums) {
                map.put(i, map.getOrDefault(i, 0)+1);
            }
            int n=nums.length/3;
           for(Map.Entry<Integer,Integer> entry:map.entrySet()){
               if(entry.getValue()>n){
                list.add(entry.getKey());
               }
           }
            

            return list;
            }
        public static void main(String[] args) {
            int arr[]={1, 2, 2, 3, 3, 4, 5};
            List<Integer> ll=new ArrayList<>();
            MajorityElement229 aa=new MajorityElement229();
            ll=aa.majorityElement(arr);
            for (int  ss: ll) {
                System.out.println(ss);
            }
        }
        
    }


