package Easy;

import java.util.Arrays;

public class HeightChecker1051 {
    public static int heightChecker(int[] heights) {
        int[] res = new int[heights.length];
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            res[i] = heights[i];
        }
        Arrays.sort(res);

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != res[i]) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 2, 3, 4 };
        int res = heightChecker(arr);
        System.out.println(res);

    }
}
