package Medium;


public class FindFirstLastPosition34 {
    public int[] searchRange(int[] nums, int target) {
         
        int f=-1,l=-1;
        for (int i = 0; i < nums.length; i++) {
                    if(nums[i]==target){
                           if(f==-1){
                            f=i;
                           }
                           l=i;
                    }
        
        }

        return new int[]{f,l};
        
    }

    public static void main(String[] args) {
        FindFirstLastPosition34 aa=new FindFirstLastPosition34();
        int arr[]={5,7,7,8,8,10};
        int res[]=aa.searchRange(arr, 8);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

}
