package Easy;
public class FindIndices2903 {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int[] res=new int[2];
        if(indexDifference==0&&valueDifference==0){
            res[0]=0;
            res[1]=0;
            return res;
        }
        boolean flag=false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(Math.abs(i-j)==indexDifference&&Math.abs(nums[i]-nums[j])==valueDifference){
                    res[0]=i;
                    res[1]=j;
                    flag=true;
                    break;
                }
            }
        }
        if (!flag){
            res[0]=-1;
            res[1]=-1;
            return res;
        }
            
        
        return res;    

    } 
}
