/**
 * MaxProduct3
 */
public class MaxProduct3 {
    public static int maximumProduct(int[] nums) {
        int product = 1;
        int n = nums.length;
        if (nums[0] > 0) {
            for (int i = 0; i < 3; i++) {
                int value = n - 3 + i;
                product *= nums[value];
            }
        } else
            
        product = (nums[n - 1] * nums[n - 2])*-1;
        return product;
    }

    public static void main(String[] args) {
        int[] nums = { -1, -2, -3 };
        System.out.println(maximumProduct(nums));

    }
}