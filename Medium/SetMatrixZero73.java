package Medium;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZero73 {
      public void setZeroes(int[][] matrix) {
        Set<Integer> rowcnt=new HashSet<>();
       Set<Integer> colcnt=new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
            if(matrix[i][j]==0){
                rowcnt.add(i);
                colcnt.add(j);
            }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(rowcnt.contains(i)||colcnt.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        SetMatrixZero73 aa=new SetMatrixZero73();
        int matrix[][]={{1,1,1},{1,0,1},{1,1,1}};
        aa.setZeroes(matrix);
    }
}
