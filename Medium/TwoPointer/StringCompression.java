package Medium.TwoPointer;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {
    public static int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder str = new StringBuilder();
        for (char c : chars) {
          
                map.put(c, map.getOrDefault(c, 0) + 1);
           
        for (Map.Entry<Character, Integer> set : map.entrySet()) {
            
                str.append(set.getKey());
            if(set.getValue()>1)
                str.append(set.getValue());
            }
        }

        return str.length();

    }

    public static void main(String args){
        char ch[]={'a','b','a','b'};
        int res=compress(ch);
        System.out.println(res);
    }
}
