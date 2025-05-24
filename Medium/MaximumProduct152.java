package Medium;

public class MaximumProduct152 {
    public int maxProduct(int[] nums) {
        int lpro=1;
        int rpro=1;
        int ans=nums[0];
        for (int i = 0; i < nums.length; i++) {
            lpro=lpro==0?1:lpro;
            rpro=rpro==0?1:rpro;
            lpro*=nums[i];
            rpro*=nums[nums.length-1-i];
            ans=Math.max(ans, Math.max(lpro, rpro));
        }

        return ans;
    }
}
