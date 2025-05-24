package Easy;


public class CountStringVowel2586 {
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }


    public static int vowelStrings(String[] words, int left, int right) {
        int cnt=0;
        for (int i = left; i <= right; i++) {
            String str=words[i];
            char f=str.charAt(0);
            char l=str.charAt(str.length()-1);
            if(isVowel(f)&& isVowel(l)){
                cnt++;
            }
          
            
        }
        return cnt;
    }
    public static void main(String[] args) {
        String[] words = {"ce","ai"};
        System.out.println(vowelStrings(words, 1, 1));
    }
}
