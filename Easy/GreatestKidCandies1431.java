package Easy;

import java.util.ArrayList;
import java.util.List;

public class GreatestKidCandies1431 {
    public /*List<Boolean>*/ void  kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for (int i = 0; i < candies.length; i++) {
            max=Math.max(max, candies[i]);
        }
        List<Boolean> values=new ArrayList<>();
        for (int i : candies) {
            if(i+extraCandies> max){
                values.add(true);
            }else{
                values.add(false);
            }
        }

        for (Boolean boolean1 : values) {
            System.out.print(boolean1+",");
        }
    }
    public static void main(String[] args) {
        GreatestKidCandies1431 aa=new GreatestKidCandies1431();
        int arr[]={2,3,4,5,6,7};
        aa.kidsWithCandies(arr,4);
    }
}
