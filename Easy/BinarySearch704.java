package Easy;
public class BinarySearch704{
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }

            if (nums[mid]<target) {
                start=mid+1;
            } else {
                end=mid-1;
            }

        }
        return -1;


    }
    public static void main(String[] args) {
        BinarySearch704 aa=new BinarySearch704();
        int arr[]={-1,0,3,5,9,12};
        int key=5;
        System.out.println(aa.search(arr, key));
    }

}