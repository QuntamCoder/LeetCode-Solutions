package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RelativeSort1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        for (int num : arr2) {
            int count = countMap.getOrDefault(num, 0);
            for (int i = 0; i < count; i++) {
                result.add(num);
            }
            countMap.remove(num); 
        }

        List<Integer> rest = new ArrayList<>(countMap.keySet());
        Collections.sort(rest);
        for (int num : rest) {
            int count = countMap.get(num);
            for (int i = 0; i < count; i++) {
                result.add(num);
            }
        }        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
        RelativeSort1122 aa = new RelativeSort1122();
        int[] res = aa.relativeSortArray(arr1, arr2);

        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
