package SlidingWindowQuestions;

import java.util.Arrays;

public class TransformArrayByParity_3467{
    public static int[] transformArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0){
                nums[i]=0; 
            }else{
           nums[i]=1;
            }
        }
        Arrays.sort(nums);
        return nums;
    }
    public static void main(String[] args) {
        int arr[]={1,5,1,2,4};
        int[]  res=new int[arr.length];
        res=transformArray(arr);
        for(int i:res){
            System.out.println(i);
        }
        
    }
}