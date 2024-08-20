import java.util.Arrays;

public class LeftRightSum {
    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] LeftSum = new int[n];
        int[] RightSum = new int[n];

        int leftSum = 0;
        int rightSum = 0;

        int index = 0;
        for (int i : nums) {
            LeftSum[index++] = leftSum;
            leftSum += i;
        }
        index = 0;
        for (int i : nums) {
            leftSum = leftSum - i;
            rightSum = leftSum;
            RightSum[index++] = rightSum;
            
        }
        for (int i = 0; i < n; i++) {   
            ans[i] = Math.abs(RightSum[i] - LeftSum[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 4, 8, 3 };
        int[] diff = leftRightDifference(nums);
        System.out.println(Arrays.toString(diff));
    }
}
