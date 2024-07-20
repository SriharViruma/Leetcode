import java.util.Arrays;

class MissingNumber {
    public static void main(String[] args) {
        int[] nums = { 0, 1 };
        int ans = missingNumber(nums);
        int ans1 = XOR(nums);
        System.out.println(ans);
        System.out.println("xor: " + ans1);
    }

    static int XOR(int[] nums) {
        int xor = 0;
        int xor2 = 0;
        for (int i : nums) {
            xor = xor ^ i;
            xor2 = xor ^ (i + 1);
        }
        return xor ^ xor2;
    }

    public static int missingNumber(int[] nums) {
        int ans = 0, left = 0, right = 1;
        int n = nums.length;
        Arrays.sort(nums);
        if (nums[n - 1] != n) {
            return n;
        }
        while (right < n) {
            if (nums[right] - nums[left] != 1) {
                ans = nums[left] + 1;
            }
            left++;
            right++;
        }
        return ans;
    }
}