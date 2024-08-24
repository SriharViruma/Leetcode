import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class ThirdMax {
     public static int thirdMaxi(int[] nums) {
        SortedSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for(int num : nums){
            set.add(num);
        }

        if (set.size() < 3) {
            return set.first();    
        }
        
        int i = 0;
        for(int sets : set){
            if (i == 2) {
                return sets;
            }
            i++;
        }

        return -1;
        
    }
    public static void main(String[] args) {
        int[] nums = {2,2,3,1};
        int[] nums2 = {1,2};
        int[] nums3 = {2,3,1};
        System.out.println(thirdMaxi(nums));
        System.out.println(thirdMaxi(nums2));
        System.out.println(thirdMaxi(nums3));
        
    }
}
