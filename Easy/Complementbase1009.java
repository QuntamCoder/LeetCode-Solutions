package Easy;

public class Complementbase1009 {
    public int bitwiseComplement(int number) {
        if (number == 0) return 1;
        String binary = "";
        while (number > 0) {
        binary = (number % 2) + binary;
        number = number / 2;
         }
         StringBuilder sb=new StringBuilder();
       
        for (char ss:binary.toCharArray()) {
            if(ss=='1'){
                sb.append('0');
            }else{
                sb.append('1');
            }
        }
             int num=Integer.parseInt(sb.toString(),2);

         return num;
    }
    public static void main(String[] args) {
        Complementbase1009 obj = new Complementbase1009();
        System.out.println(obj.bitwiseComplement(5)); // Output: 2
    }
    
}
