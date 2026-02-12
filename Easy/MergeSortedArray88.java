package Easy;

import java.util.Arrays;

public class MergeSortedArray88 {
public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
         for (int i = m; i < m+n; i++) {
            nums1[i]=nums2[j++];
            
         }
         
         Arrays.sort(nums1);
         for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
         }


    }
    public static void main(String[] args) {
        MergeSortedArray88 aa=new MergeSortedArray88();
        int arr1[]={1,2,4,3,5,0,0,0,0};
        int arr2[]={2,3,4,5};
        aa.merge(arr1, 5, arr2, 4);
    }
}
