package Easy;
public class BestTimeToSell121 {
     public int maxProfit(int[] prices) {
        int maxProfit=0;
        for (int i = 0; i < prices.length; i++) {
            int currProfit=0;
            for (int j = i+1; j < prices.length; j++) {
                if(prices[j]>prices[i])
                {
                    currProfit=prices[j]-prices[i];
                    maxProfit=Math.max(maxProfit, currProfit);
                }
            }
        }
        return maxProfit;

        
    }
    public static void main(String[] args) {
        BestTimeToSell121 aa=new BestTimeToSell121();
        int arr[]={7,1,6,5,3,6,4};
        System.out.println(aa.maxProfit(arr));
    }
}


