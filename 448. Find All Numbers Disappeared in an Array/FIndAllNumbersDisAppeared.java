import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.SortedSet;

public class FIndAllNumbersDisAppeared {
    public static List<Integer> findDisAppeared(int[] nums) {
        List<Integer> list = new ArrayList<>();
        SortedSet<Integer> set = new TreeSet<>();
        for(int num : nums){
            set.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        int[] nums1 = {1,1};
        System.out.println(findDisAppeared(nums));
        System.out.println(findDisAppeared(nums1));
    }

}
