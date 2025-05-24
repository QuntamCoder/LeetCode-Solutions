package Easy;

public class CountLessNum1365 {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int[] res=new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                int cnt=0;
                for (int j = 0; j < nums.length; j++) {
                    if(nums[j]<nums[i]){
                        cnt++;
                    }
                }
                res[i]=cnt;
            }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,4,5,1};
        CountLessNum1365 aa=new CountLessNum1365();
        int res[]=aa.smallerNumbersThanCurrent(arr);
        for (int i : res) {
            System.out.print(i);
        }
    }
}
