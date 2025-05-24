package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.lang.model.type.IntersectionType;

public class InterSectionOfTwoArrays350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        for (int i : nums1) {
            map1.put(i,map1.getOrDefault(i, 0)+1);
        }
        for (int i : nums2) {
            map2.put(i,map2.getOrDefault(i, 0)+1);

        }
        List<Integer> list=new ArrayList<>();
        int i=0;
        for (Map.Entry<Integer,Integer> entry:map1.entrySet()) {
            if(map2.containsKey(entry.getKey())){
                int map1cnt=entry.getValue();
                int map2cnt=map2.get(entry.getKey());
                int min=Math.min(map1cnt, map2cnt);
                for ( i = 0; i < min; i++) {
                    list.add(entry.getKey());
                }
            }
        }
                int[] res=new int[list.size()];

        int k=0;
        for (int integer : list) {
           res[k++]=integer; 
        }

        return res;
    }
    public static void main(String[] args) {
        int arr1[]={1,3,2,1};
        int arr2[]={1,2,2,1};
        InterSectionOfTwoArrays350 aa=new InterSectionOfTwoArrays350();
        int res[]=aa.intersect(arr1, arr2);
        for (int i : res) {
            System.out.println(i);
        }
    }

}
