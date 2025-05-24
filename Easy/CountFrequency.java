package Easy;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void countFrequency(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
                map.put(i, map.getOrDefault(i, 0) + 1);
           
}
for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        }
        public static void main(String[] args) {
            int arr[]={1,1,2,3,4,1,10};
            countFrequency(arr);
        }
    }
