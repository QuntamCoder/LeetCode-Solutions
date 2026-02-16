package Easy;

//Leetcode problem number 190

public class ReBit {
        public int reverseBits(int n) {
        String binary = Integer.toBinaryString(n);
        
        while(binary.length() < 32){
            binary = "0" + binary;
        }
        
        String reversed = "";
        for(int i = binary.length() - 1; i >= 0; i--){
            reversed += binary.charAt(i);
        }
        
        long result = 0;
        long power = 1;
        
        for(int i = reversed.length() - 1; i >= 0; i--){
            if(reversed.charAt(i) == '1'){
                result += power;
            }
            power *= 2;
        }
        
        return (int) result;
    }
public static void main(String[] args) {
    ReBit aa=new ReBit();
    int result=aa.reverseBits(2147483644);
    System.out.println(result);
}
}
                  