package Easy;

import java.util.HashMap;

public class RansomeNote383{
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (char ch : magazine.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for (char ch: ransomNote.toCharArray()) {
        if (map.containsKey(ch) && map.get(ch) > 0) {
                map.put(ch, map.get(ch) - 1);
            } else {
                return false; 

        }

    }
            return true;

    }
    public static void main(String[] args) {
        RansomeNote383 aa=new RansomeNote383();
        String arr="ab";
        String str="cb";
        System.out.println(aa.canConstruct(arr, str));
    }
}