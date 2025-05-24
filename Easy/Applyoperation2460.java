package Easy;
public class Applyoperation2460 {
    public int[] applyOperations(int[] nums) {
        
        int[] res=new int[nums.length];
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int ind=0;
        for (int i : nums) {
            if(i!=0){
                res[ind++]=i;
            }
        }

        return res;

    }
    public static void main(String[] args) {
        int arr[]={1,2,2,1,1,0};
        int[] res=new int[arr.length];
        Applyoperation2460 aa=new Applyoperation2460();
        res=aa.applyOperations(arr);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
