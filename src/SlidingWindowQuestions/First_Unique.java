package SlidingWindowQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class First_Unique {
    class Solution {
        public static int firstUniqChar(String s) {
            int[] freq = new int[26];
                for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }
                for (int i = 0; i < s.length(); i++) {
                if (freq[s.charAt(i) - 'a'] == 1) {
                    return i;
                }
            }
            return -1;
        }
    }
    
    // public static int firstUniqChar(String s) {
    //     Map<Character, Integer> countMap = new HashMap<>();
    
    //     for (char c : s.toCharArray()) {
    //         countMap.put(c, countMap.getOrDefault(c, 0) + 1);
    //     }
    
    //     for (int i = 0; i < s.length(); i++) {
    //         if (countMap.get(s.charAt(i)) == 1) {
    //             return i; 
    //         }
    //     }
    
    //     return -1; 
    // }
    
    public static void main(String args[]){
        int res=firstUniqChar("amolo");
        System.out.println(res);

    }
}
