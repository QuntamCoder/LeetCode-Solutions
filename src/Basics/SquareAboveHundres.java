public class SquareAboveHundres {
     static int findSquare(int num){
        int n=num,temp=0,sum=0;
        temp=n-100;
        num=num+temp;
        System.out.println(num);
        if(temp*temp>99){
            while(num>99){
                sum=num%10;
                num=num/10;
            }
            sum=temp*temp;
            System.out.println(num+""+sum);
        }
        else{
            System.out.println(num+""+temp*temp);

        }

        return 1;
     }

     public static void main(String args[]){
        int num=180;
        findSquare(num);
     }
}
