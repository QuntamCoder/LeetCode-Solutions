import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElements {
    public static void main(String args[]){
        Set<Integer> uniqueNumber=new HashSet();
        boolean check=false;
        int arr[]={1,2,3,2,4,1};
        for (int i = 0; i < arr.length; i++) {
            if(uniqueNumber.contains(arr[i])){
                continue;
             }else{
                uniqueNumber.add(arr[i]);
            }
        }
        for(int i:uniqueNumber){
            System.out.println(i);
        }
    }
}
