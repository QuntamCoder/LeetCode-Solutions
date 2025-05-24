package Easy;

import java.util.HashMap;
import java.util.Map;

public class CountLargest1399 {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer > map=new HashMap<>();
        int cnt=0;
        int sum=0;
        int dig=0,num=0;
      for (int i = 1; i <=n; i++) {
         sum=0;
         dig=0;
         num=i;
        while(num!=0){
           dig=num%10;
           sum+=dig;
           num=num/10;
        } 
        map.put(sum, map.getOrDefault(sum,0)+1);
        res[cnt++]=sum;


      } 
      int max=0;
      int current=0;
      for(Map.Entry<Integer,Integer> ss:map.entrySet()){
             current=ss.getValue();
             max=Math.max(max, current);
      }
      int ans=0;
      for(Map.Entry<Integer,Integer> ss:map.entrySet()){
             if(ss.getValue()==max){
                ans++;
             }
      }



     return ans; 
    
    }
    public static void main(String[] args) {
        CountLargest1399 aa=new CountLargest1399();

        System.out.println(aa.countLargestGroup(2));
    }
}
