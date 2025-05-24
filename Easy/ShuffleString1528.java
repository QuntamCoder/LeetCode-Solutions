package Easy;

import java.util.Map;
import java.util.TreeMap;

public class ShuffleString1528 {
    public String restoreString(String s, int[] indices) {
               Map< Integer,Character> map = new TreeMap<>();
               int i=0;
               for (char c:s.toCharArray()) {
                map.put(indices[i++],c);
               }
               StringBuilder sb=new StringBuilder();
               for(Map.Entry<Integer,Character> entry:map.entrySet()){
                sb.append(entry.getValue());
               }

               return sb.toString();
    }
    public static void main(String[] args) {
        ShuffleString1528 aa=new ShuffleString1528();
        int arr[]={4,5,6,7,0,2,1,3};
        String ss="codeleet";
        System.out.println(aa.restoreString(ss,arr));
    }
}
