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
     int b = map.getOrDefault('b', 0);
        int a = map.getOrDefault('a', 0);
        int l = map.getOrDefault('l', 0) / 2; 
        int o = map.getOrDefault('o', 0) / 2; 
        int n = map.getOrDefault('n', 0);

        return Math.min(Math.min(b, a), Math.min(Math.min(l, o), n));
    }
    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("loonbalxballpoon"));
    }
}
