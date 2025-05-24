public class FindoccureneOfElementInArray {
    static void findOccurenceOfElement(int arr[]){
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j])
                c++;
            }
            System.out.println("Occuerence of "+arr[i]+"is"+c);
            c=0;
          
        }
    }
    public static void main(String args[]){
        int arr1[]={2,2,3,4,5};
        findOccurenceOfElement(arr1);
    }
}
