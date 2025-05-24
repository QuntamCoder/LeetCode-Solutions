package Easy;

public class RunningSum1480 {
    public int[] runningSum(int[] nums) {
        
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if(i==0){
                nums[i]=nums[i];
                j=i;
            }else{
            nums[i]+=nums[j];
            j=i;}
        }
        return nums;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int[] res=new int[arr.length];
        RunningSum1480 aa=new RunningSum1480();
        res=aa.runningSum(arr);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
