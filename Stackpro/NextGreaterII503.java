package Stackpro;

public class NextGreaterII503 {
    public int[] nextGreaterElements(int[] nums) {
        int[] nums2=new int[nums.length];
        int[] res=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums2[i]=nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums2[j]>nums[i]){
                    res[i]=nums2[j];
                    break;
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            if(res[i]==0){
                res[i]=-1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,3};
        int arr2[]={1,3,4,2};
        NextGreaterII503 aa=new NextGreaterII503();
        int[] res=new int[arr1.length];
        res=aa.nextGreaterElements(arr1);
        for (int i : res) {
            System.out.println(i);
        }
    }
    }

    // class Solution {
    //     public int[] nextGreaterElements(int[] nums) {
            // int n = nums.length;
            // int[] res = new int[n];
    
            // for (int i = 0; i < n; i++) {
            //     boolean found = false;
    
            //     for (int j = 1; j < n; j++) {
            //         int index = (i + j) % n;
            //         if (nums[index] > nums[i]) {
            //             res[i] = nums[index];
            //             found = true;
            //             break;
            //         }
            //     }
    
            //     if (!found) {
            //         res[i] = -1;
            //     }
            // }
    
            // return res;
    //     }
    // }
    