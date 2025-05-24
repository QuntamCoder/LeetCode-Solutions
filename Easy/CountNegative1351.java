package Easy;
public class CountNegative1351 {
    public int countNegatives(int[][] grid) {
        int cnt=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]<0){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        CountNegative1351 aa=new CountNegative1351();
        int arr[][]={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int res=aa.countNegatives(arr);
        System.out.println(res);
    }
}
