package Medium;
public class DigitOne233 {
     public static int countDigitOne(int n) {
        int count =0;
        for (int i = 1; i <=n; i++) {
            if(i<9){
                if(i==1){
                    count++;
                }
            }else{
                int temp=i;
                while(temp!=0){
                    int dig=temp%10;
                    if(dig==1){
                        count++;
                    }
                    temp=temp/10;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countDigitOne(0));
    }
}
