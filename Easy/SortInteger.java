package Easy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Pair{

    int key;
    int value;
public Pair(int key,int value){
   this.key=key;
   this.value=value;
    }
}

public class SortInteger {
    public int[] sortByBits(int[] arr) {
List<Pair> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int cnt = 0;
            while (num > 0) {
                int rem = num % 2;
                if (rem == 1)
                    cnt++;
                num = num / 2;
            }
            list.add(new Pair(arr[i], cnt));

        }

        
        Collections.sort(list, (a, b) -> {
            if (a.value!=b.value) {
                return a.value - b.value;
            } else {
                return a.key - b.key;
            }
        });

        int[] res = new int[arr.length];
        int i = 0;
        for (Pair entry : list) {
            res[i++] = entry.key;
        }

        return res;
    }

}
