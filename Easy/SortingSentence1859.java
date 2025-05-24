package Easy;

public class SortingSentence1859 {
    public String sortSentence(String s) {
        String arr[]=s.split(" ");
        String[] result=new String[arr.length];
        for (String word : arr) {
    int n = word.length();
    int pos = word.charAt(n - 1) - '1'; 
    result[pos] = word.substring(0, n - 1); 
}

return String.join(" ", result);

    }
    public static void main(String[] args) {
        SortingSentence1859 aa=new SortingSentence1859();
        String str=aa.sortSentence("is2 sentence4 This1 a3");
        System.out.println(str);
    }
}
