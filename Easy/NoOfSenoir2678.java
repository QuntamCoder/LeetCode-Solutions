package Easy;

public class NoOfSenoir2678 {
    public int countSeniors(String[] details) {

        int cnt=0;
        StringBuilder sb=new StringBuilder();
        int[] res= new int[details.length];
        for (int i = 0; i < details.length; i++) {
            String word=details[i];
             for (int j = 11; j < 13; j++) {
                  sb.append(word.charAt(j));
             }
             res[cnt++]=Integer.parseInt(sb.toString());
             sb.setLength(0);
 
        }
        int finalcount=0;
                  for(int s:res){
            if(s>60){
                finalcount++;
            }
          }


        return finalcount;
    }
    public static void main(String[] args) {
        NoOfSenoir2678 aa=new NoOfSenoir2678();
        String arr[]={"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(aa.countSeniors(arr));
    }
}
