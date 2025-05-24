package SlidingWindowQuestions;

public class TransposeMatrix_867 {

    public static int[][] printTranspose(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int[][] output = new int[cols][rows];  
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                output[j][i] = mat[i][j]; 
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[][] mart = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] transposed = printTranspose(mart);

        // Print the transposed matrix
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[0].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
