package Medium.TwoPointer;
public class RotateArray189 {
    public static int[] reverse(int i,int j,int nums[]){
        while(i<j){
           int temp=nums[j];
           nums[j]=nums[i];
           nums[i]=temp;
           i++;
           j--;
     }
    return nums;
    }
 public static void rotate(int[] nums, int k) {
    int n=nums.length;
    k=k%n;
    reverse(0,n-1, nums);
    reverse(0,k-1, nums);
    reverse(k, n-1, nums);
    for (int j = 0; j < nums.length; j++) {
        System.out.println(nums[j]);
    }
        
    }
public static void main(String[] args) {
    int arr[]={2,3,4,2,5,6};
    int k=3;
    rotate(arr, k);
}
    
}