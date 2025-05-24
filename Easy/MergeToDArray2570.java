package Easy;

import java.util.Map;
import java.util.TreeMap;

public class MergeToDArray2570 {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer,Integer> map=new TreeMap<>();
        for (int[] is : nums1) {
            map.put(is[0],is[1]);
        }
        for (int[] is : nums2) {
            if(map.containsKey(is[0])){
                map.put(is[0], map.get(is[0])+is[1]);
            }else
            map.put(is[0], is[1]);
        }
        int[][]  res=new int[map.size()][2];
        int i=0;
       for(Map.Entry<Integer,Integer> aa:map.entrySet()){
           res[i][0]=aa.getKey();
           res[i][1]=aa.getValue();
           i++;
       }
       return res;
    }
    public static void main(String[] args) {
        MergeToDArray2570 aa=new MergeToDArray2570();
        int arr1[][] = {{1, 2}, {2, 3}, {4, 5}};
        int arr2[][] = {{1, 4}, {3, 2}, {4, 1}};
        int[][] res=new int[arr1.length+arr2.length][2];
        res=aa.mergeArrays(arr1, arr2);
        for (int[] is : res) {
            System.out.println("key"+is[0]+" "+"value:"+is[1]);
        }


    }
}
