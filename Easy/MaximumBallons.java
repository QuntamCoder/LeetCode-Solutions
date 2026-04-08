package Easy;

import java.util.HashMap;
import java.util.Map;

public class MaximumBallons {
        public static int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:text.toCharArray()){ 
            if(c=='b'||c=='a'||c=='l'||c=='o'||c=='n'){
                map.put(c, map.getOrDefault(c, 0)+1);
            }
        } 
     int n=Integer.MAX_VALUE;
      for (Map<Character,Integer> set:map.entrySet()) {
n = Math.min(set.getValue(), n);;      }
        
        return  n;
    }
    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("loonbalxballpoon"));
    }
}
