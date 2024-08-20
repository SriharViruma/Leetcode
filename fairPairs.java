import java.util.Arrays;

public class fairPairs {
    public static long countFairPairs(int[] nums, int lower, int upper) {
        long count = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int low = Arrays.binarySearch(nums, i + 1, nums.length, lower - nums[i]);
            if (low < 0) {
                low = -low - 1;
            }

            int high = Arrays.binarySearch(nums, i + 1, nums.length, upper - nums[i]);

            if (high < 0) {
                high = -high - 2;
            }

            if (low <= high) {
                count += (high - low + 1);
            }

        }

        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 7, 4, 4, 5 };
        int lower = 3;
        int upper = 6;
        countFairPairs(nums, lower, upper);
    }
}
