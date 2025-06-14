package Easy;

public class SortArrayByParity905 {
    public int[] sortArrayByParity(int[] nums) {
        int evenCnt=0;
        int oddCnt=0;
        int[] EvenArr=new int[nums.length];
        int[] odddArr=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0){
                EvenArr[evenCnt++]=nums[i];
            }else{
                odddArr[oddCnt++]=nums[i];
            }
        }

        for (int i = 0; i <oddCnt; i++) {
            EvenArr[evenCnt++]=odddArr[i];
        }
        return EvenArr;

    }
}
