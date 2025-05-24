package Medium;

public class MultiplyString43 {
    public  String multiply(String num1, String num2) {
        int n1=Integer.parseInt(num1);
        int n2=Integer.parseInt(num2);
        if(n1==0||n2==0){
            return "0";
        }

        int prod=n1*n2;
        String res=toString().valueOf(prod);
        return res;
    }
    public static void main(String[] args) {
        MultiplyString43 aa=new MultiplyString43();
        System.out.println(aa.multiply("123", "456"));
    }

}
