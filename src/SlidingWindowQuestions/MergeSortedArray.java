package SlidingWindowQuestions;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] num3=new int[m+n];
        int cnt=0;
        for(int i=0;i<m;i++){
           
            num3[cnt++]=nums1[i];
        }
        for (int i = 0; i <n; i++) {
            num3[cnt++]=nums2[i];
        }
        Arrays.sort(num3);
        for (int i = 0; i < num3.length; i++) {
            nums1[i]=num3[i];
        }
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,0,0,0};
        int arr2[]={2,3,4};
        int len1=arr1.length;
        int len2=arr2.length;
        merge(arr1, 3, arr2, 3);

    }   
}
