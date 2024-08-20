import java.util.Arrays;

/**
 * SmallerCurrentNumbers
 */
public class SmallerCurrentNumbers {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int index= 0;
        int count = 0;
        for(int i = 0 ; i < n ; i++)
        {
        int temp = nums[i];
         for(int j = 0 ; j < n;j++)
         {
            if(nums[j] < temp)
            count++;
         }
            ans[index++] = count;
            count = 0;
        }

        return ans;    
    }
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] ans = new int[0];
        ans = smallerNumbersThanCurrent(nums);
      System.out.println(Arrays.toString(ans));
    }
}