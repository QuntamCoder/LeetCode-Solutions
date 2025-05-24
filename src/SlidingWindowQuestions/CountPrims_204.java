package SlidingWindowQuestions;

public class CountPrims_204 {
    public static int countPrimes(int n) {
        if(n==0||n==1){
            return 0;
        }
        int cnt=0;
        for (int i = 2; i < n; i++) {
            boolean isprime=true;
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if (isprime) {
                cnt++;
            }
        }


        return cnt;
    }
    public static void main(String[] args) {
        System.out.println(countPrimes(499999));
    }
}
