import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class CountPairsLessTarget {
    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        Collections.sort(nums);
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if (nums.get(i)+nums.get(j) < target) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-1,1,2,3,1);
        int target = 2;
        System.out.println(countPairs(list, target));

    }
}