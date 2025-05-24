public class LargsetElementOfTheArray {
    public static int findLargest(int arr[]){
        int largest=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int arr1[]={2,4,5,7,9,3};
        System.out.println("largest number of the given array is"+findLargest(arr1));
    }
}
