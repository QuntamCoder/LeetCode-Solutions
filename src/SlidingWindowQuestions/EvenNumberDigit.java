package SlidingWindowQuestions;

public class EvenNumberDigit {
    public static int findNumbers1(int[] nums1) {
        int cnt = 0;
        for (int i = 0; i < nums1.length; i++) {
            if ((nums1[i] > 9 && nums1[i] < 100) || (nums1[i] > 999 && nums1[i] < 10000) || nums1[i] == 100000) {
                cnt++;
            }
        }
        return cnt;
    }

    public static int findNumbers(int[] nums) {
        if (nums.length == 0)
            return 0;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            int digcnt = 0;
            while (nums[i] != 0) {
                nums[i] = nums[i] / 10;
                digcnt++;
            }
            if (digcnt % 2 == 0)
                cnt++;
        }
        return cnt;

    }

    public static void main(String args[]) {
        int aar[] = { 0, 0, 12, 0 };
        int res = findNumbers1(aar);
        System.out.println(res);
    }
}
