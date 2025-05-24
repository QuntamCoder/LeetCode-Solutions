package Easy;

public class StringWord557 {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        StringBuilder sb=new StringBuilder();
        StringBuilder str=new StringBuilder();
        // for (String string : arr) {
        //     str.append(string);
        //     sb.append(str.reverse()+" ");
        //     str.setLength(0);;
        // }
        for (int i = 0; i < arr.length; i++) {
            str.append(arr[i]);
            if(i==0)
            sb.append(str.reverse());
            else
            sb.append(" "+arr[i]);
        
        str.setLength(0);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        StringWord557 aa=new StringWord557();
        String st="amol ashok jadhav";
        String res=aa.reverseWords(st);
        System.out.println(res);
    }
}
