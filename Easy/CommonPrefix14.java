package Easy;

public class CommonPrefix14 {
    public static String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) return "";

        StringBuilder word=new StringBuilder();
        StringBuilder newWord=new StringBuilder();
        word.append(strs[0]);
        for (int i = 0; i < strs.length-1; i++) {
            int  j=0;
            for (char ch :strs[i+1].toCharArray()) {
                if(j<word.length() && ch==word.charAt(j++)){
                    newWord.append(ch);
                }else{
                    break;
                }
            }
            word.setLength(0);
            word.append(newWord);
            newWord.setLength(0);
             if(word.length()==0) {
                return "";
            }   
        }

       

        return  word.toString();
        
    }
    public static void main(String[] args) {
        String word[]={"aay","amin","ajay"};
        System.out.println(longestCommonPrefix(word));
    }
}
