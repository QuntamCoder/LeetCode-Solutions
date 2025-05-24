package Medium;

import java.lang.reflect.Array;
import java.util.*;

public class SortCharacter451 {

    static class CharCount {
        char ch;
        int count;

        CharCount(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public String frequencySort1(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (countMap.containsKey(ch)) {
                countMap.put(ch, countMap.get(ch) + 1);
            } else {
                countMap.put(ch, 1);
            }
        }

        LinkedList<CharCount> list = new LinkedList<>();
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            list.add(new CharCount(entry.getKey(), entry.getValue()));
        }

        list.sort((a, b) -> b.count - a.count);

        StringBuilder result = new StringBuilder();
        for (CharCount item : list) {
            for (int i = 0; i < item.count; i++) {
                result.append(item.ch);
            }
        }

        return result.toString();
    }

    

    public String frequencySort(String s) {
        Map<Character,Integer> map=new TreeMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
            
        }
        StringBuilder ans=new StringBuilder();
        int[] arr=new int[s.length()];
        int i=0;
        for(Map.Entry<Character,Integer> res:map.entrySet()){
            arr[i++]=res.getValue();
        }
        // Arrays.sort(arr);
        int j=0;
        for(Map.Entry<Character,Integer> res:map.entrySet()){
            if(arr[j]==res.getValue()){
                for (int j2 = 0; j2 < res.getValue(); j2++) {
                    ans.append(res.getKey());
                }
            }   
            j++;
        }
        
        return ans.reverse().toString();
    }
    public static void main(String[] args) {
        SortCharacter451 aa=new SortCharacter451();
        String s=aa.frequencySort("raaeaedere");
        System.out.println(s);
    }
}
