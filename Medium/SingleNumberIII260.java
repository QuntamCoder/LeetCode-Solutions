package Medium;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class SingleNumberIII260 {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int cnt=0;
        int first=0,last=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
         if(cnt==0){
            if(entry.getValue()==1){
                first=entry.getKey();
                cnt++;}
            }else if(cnt==1){
                 if(entry.getValue()==1){
                last=entry.getKey();
                break;
            }
         }

        }
        return new int[]{first,last};
    }
    public static void main(String[] args) {
        int arr[]={-1,0};
        SingleNumberIII260 aa=new  SingleNumberIII260();
        int res[]=aa.singleNumber(arr);
        for (int i : res) {
            System.out.println(i);
        }
        
    }
}
