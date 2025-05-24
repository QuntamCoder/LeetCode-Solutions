package Stackpro;
public class NextGreater496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        boolean flag=false;
        int[] result=new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            flag=false;
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i]==nums2[j]){
                    flag=true;
                }
                if(flag&&nums2[j]>nums1[i]){
                        result[i]=nums2[j];
                        break;
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            if(result[i]==0){
                result[i]=-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr1[]={4,1,2};
        int arr2[]={1,3,4,2};
        int[] res=new int[arr1.length];
        NextGreater496 aa=new NextGreater496();
        res=aa.nextGreaterElement(arr1,arr2);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
