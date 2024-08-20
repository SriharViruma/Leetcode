import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionArray {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int i : nums2) {
            set2.add(i);
        }

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    intersection.add(nums1[i]);
                }
            }
        }

        int[] ans = new int[intersection.size()];
        int index = 0;

        for (int i : intersection) {
            ans[index++] = i;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = { 4, 9, 5 };
        int[] nums2 = { 9, 4, 9, 8, 4 };
        int[] arr = intersection(nums1, nums2);
        System.out.println(Arrays.toString(arr));
    }
}
