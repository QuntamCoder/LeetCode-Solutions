package Medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class KthLargest215{
    public int findKthLargest(int[] nums, int k) {
        Integer[] res=new Integer[nums.length];
        int i=0;
        for (int j : nums) {
            res[i++]=j;
        }
        Arrays.sort(res, Collections.reverseOrder());
         int sum=0;
        for (int j = 0; j < k; j++) {
            sum=res[j];
        }
        return sum;
    }
    public static void main(String[] args) {
         int arr[] = {3,2,3,1,2,4,5,5,6};
         KthLargest215 aa=new KthLargest215();
         int res=aa.findKthLargest(arr, 4);
         System.out.println(res);

    }

}