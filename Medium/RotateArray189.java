package Medium;

import java.util.Arrays;

public class RotateArray189 {
    public void rotate(int[] nums, int k) {
            int n=nums.length;
            int[] res=new int[n];
            int c=0;
        for (int i = n-1; i >=0; i--) {
            res[c++]=nums[i];
        }
        
        int cnt=0;
        for (int i =n-k ; i >=0; i--) {
            nums[cnt++]=res[i];
        }
        for (int i =n-1 ; i >=k; i--) {
            nums[cnt++]=res[i];
        }

        for (int i : res) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        RotateArray189 aa=new RotateArray189();
        int arr[]={1,2,3,4,5,6};
        aa.rotate(arr,3);
    }
}
