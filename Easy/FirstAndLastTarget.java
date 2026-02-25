public class FirstAndLastTarget {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        if (nums.length < 1) {
            return new int[] { -1, -1 };
        }
        if (nums.length == 1 && nums[0] != target)
            return new int[] { -1, -1 };

        while (left <= right) {
            if (nums[left] == target && nums[right] == target) {
                return new int[] { nums[left], nums[right] };
            }
            left++;
            right--;
        }
        return new int[] { -1, -1 };
    }

    int findFirst(int nums[], int tar) {
        int l = 0, r = nums.length - 1, ind = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == tar) {
                ind = mid;
                r = mid - 1;
            } else if (nums[mid] < tar) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ind;

    }

    int findLast(int nums[], int tar) {
        int l = 0, r = nums.length - 1, ind = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == tar) {
                ind = mid;
                l = mid + 1;
            } else if (nums[mid] < tar) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ind;
    }

    int[] findFirstLast(int nums[], int tar) {
        int first = findFirst(nums, tar);
        int last = findLast(nums, tar);
        return new int[] { first, last };
    }

    public static void main(String[] args) {
        FirstAndLastTarget obj=new FirstAndLastTarget();
        int[] result = obj.findFirstLast(new int[]{2,3,3,4,4,4,6,8},4);
        System.out.println("First and last positions: [" + result[0] + ", " + result[1] + "]");
    }
}