package Easy;

import java.math.BigInteger;

public class AddString415 {
        public String addStrings(String num1, String num2) {
              BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);

        BigInteger res = n1.add(n2);

        StringBuilder sb = new StringBuilder();
        sb.append(res.toString());
        return sb.toString();



        }
        public static void main(String[] args) {
            AddString415 aa=new AddString415();
            System.out.println(aa.addStrings("11", "33"));
        }
}
