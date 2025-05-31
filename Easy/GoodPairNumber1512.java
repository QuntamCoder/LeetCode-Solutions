package Easy;
public class GoodPairNumber1512 {
   public int numIdenticalPairs(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]&&i<j){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        GoodPairNumber1512 aa=new GoodPairNumber1512();
        int arr[]={1,2,3,1,1,3,4};
        System.out.println(aa.numIdenticalPairs(arr));
    } 
}
