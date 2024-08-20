import java.util.Arrays;

public class mergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = Arrays.copyOf(nums1, m+n);
        int index = m;
        for (int i : nums2) {
            arr[index++] = i;
        }
        Arrays.sort(arr);
       for (int i = 0; i < arr.length; i++) {
        nums1[i] = arr[i];
       }
    }
    
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

    }
}
