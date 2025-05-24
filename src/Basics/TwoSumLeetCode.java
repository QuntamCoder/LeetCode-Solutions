public class TwoSumLeetCode {
    public static int[] addTwoSum(int arr[],int tar){
        for (int index = 0; index < arr.length; index++) {
            for (int j = index+1; index < arr.length; j++) {
                if(arr[index]+arr[j]==tar){
                    int a[]={index,j};
                    return a;
                }
            }
        }
        return null;
    }
    public static void main(String args[]){
        int nums[]={2,3,4,5,7};
        int target=5;
//        int sum[];

        System.out.println(addTwoSum(nums,target));
//        for (int i = 0; i < sum.length; i++) {
//            System.out.println(sum);
//        }
    }
}
