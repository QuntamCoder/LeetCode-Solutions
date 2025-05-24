package Medium;

import java.util.Arrays;

public class FindLargest179 {
    public String largestNumber(int[] nums) {
        String[] stringNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            stringNums[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(stringNums, (a, b) -> (b + a).compareTo(a + b));

        if (stringNums[0].equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for (String str : stringNums) {
            result.append(str);
        }

        return result.toString();
    }
    public static void main(String[] args) {
        FindLargest179 aa=new FindLargest179();
        int arr[]={10,2};
        String str=aa.largestNumber(arr);

        System.out.println(str);
    }
}                

