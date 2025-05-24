package Medium;

import java.util.Arrays;

public class MaximumIceCreamBar1833 {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int cnt=0;
        int sum=0;
        for (int i = 0; i < costs.length; i++) {
            if(costs[i]<=coins && sum!=coins){
            sum+=costs[i];
             cnt++;
            }
        }
        return cnt;
    
}
public static void main(String[] args) {
    MaximumIceCreamBar1833 aa=new MaximumIceCreamBar1833();
    int arr[]={1,2,3,4,5};
    int res=aa.maxIceCream(arr,10);
    System.out.println(res);
}
}
