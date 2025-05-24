package SlidingWindowQuestions;
import java.util.HashSet;

public class Duplicate_219 {
    public static int checkDuplicate(int arr[]){
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
           if(set.contains(num)){
            return 1;
           }else{
            set.add(num);
           }
        }
        return 0;

    }
    public static void main(String args[]){
    int nums[]={1,2,4,2};
    int res=checkDuplicate(nums);
    if(res==1){
   System.out.println("contain duplicate");
    }else{
        System.out.println("not contain duplicate");
    }
    }
}
