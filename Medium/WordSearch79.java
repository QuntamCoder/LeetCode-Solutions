package Medium;

import java.util.HashMap;
import java.util.Map;

public class WordSearch79 {
    public boolean exist(char[][] board, String word) {
        
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

        for (char ss:word.toCharArray()) {
            map2.put(ss, map2.getOrDefault(ss, 0)+1);
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                map1.put(board[i][j], map1.getOrDefault(board[i][j], 0)+1);
            }
        }
         boolean isSubset = true;
        for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();

            if (!map1.containsKey(key) || map1.get(key) < value) {
                isSubset = false;
                break;
            }
        }
   return isSubset;


    }
    public static void main(String[] args) {
        WordSearch79 aa=new WordSearch79();
        char[][] board = {
    {'A', 'B', 'C', 'E'},
    {'S', 'F', 'H', 'I'},
    {'A', 'D', 'E', 'E'}
};

        System.out.println(aa.exist(board, "ABHI"));
    }
    }

