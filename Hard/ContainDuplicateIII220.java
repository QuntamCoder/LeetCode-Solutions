package Hard;

public class ContainDuplicateIII220 {
  public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
      int k=indexDiff;
      for (int i = 0; i < nums.length; i++) {
        if(Math.abs(i-k)<=indexDiff && Math.abs(nums[i]-nums[k])<=valueDiff){
            return true;
        }
        k++;
      } 
    
      return false;

    }
}

