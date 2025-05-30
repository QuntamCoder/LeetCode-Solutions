package Easy;

public class SubtractTheProduct1281 {
    public int subtractProductAndSum(int n) {
            int num=n;
            int dig=0;
            int sum=1,addsum=0;;
            while (num!=0) {
                dig=num%10;
                addsum+=dig;
                sum=sum*dig;
                num=num/10;
            }

            return sum-addsum;
    }
    public static void main(String[] args) {
        SubtractTheProduct1281 aa=new SubtractTheProduct1281();
        System.out.println(aa.subtractProductAndSum(234));
    }
}
