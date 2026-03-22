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
            if (map.containsKey(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            map.put(c, 1);
        }
        for (Map.Entry<Character, Integer> set : map.entrySet()) {
            if (set.getValue() == 1) {
                str.append(set.getKey());
            } else {
                str.append(set.getKey());
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
