package Medium;

import java.util.HashSet;
import java.util.Set;

public class LongLenSubStr3 {
       public static int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxCnt=0;
        Set<Character> set =new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(right));
            maxCnt=Math.max(maxCnt, right-left+1);
        }
        return maxCnt;
    } 
}
