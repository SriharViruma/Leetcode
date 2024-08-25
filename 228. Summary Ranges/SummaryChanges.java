import java.util.ArrayList;
import java.util.List;

public class SummaryChanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<String>();

        if (nums.length == 0)
            return list;
        int left = nums[0];
        int right = nums[0] + 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != right) {
                if (left == (right - 1)) {
                    list.add(left + "");

                } else {
                    list.add(left + "->" + (right - 1));
                }
                left = nums[i];
                right = left + 1;

            } else {
                right++;
            }

        }
        System.out.println(left + " " + right);
        if (left == (right - 1)) {
            list.add(left + "");
        } else {
            list.add(left + "->" + (right - 1));
        }

        return list;

    }

    
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 4, 5, 7 };
        int[] nums2 = { 0, 2, 3, 4, 6, 8, 9 };
        System.out.println(summaryRanges(nums));
        System.out.println(summaryRanges(nums2));
    }

}
