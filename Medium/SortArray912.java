package Medium;

public class SortArray912 {
    public int[] sortArray(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        SortArray912 aa=new SortArray912();
        int arr[]={5,3,2,1};
        int res[]=aa.sortArray(arr);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
