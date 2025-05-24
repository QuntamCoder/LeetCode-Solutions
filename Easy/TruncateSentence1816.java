package Easy;

public class TruncateSentence1816 {
    public String truncateSentence(String s, int k) {
        String str[]=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++){
            if(i==k-1){
                            sb.append(str[i]);

            }else{
            sb.append(str[i]+" ");

            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        TruncateSentence1816 aa=new TruncateSentence1816();
        String st="Hello how are you Contestant";
        System.out.println(aa.truncateSentence(st, 4));
    }
}
