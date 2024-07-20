import java.util.TreeMap;
import java.util.Map;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(FindDuplicate(nums));
        
        
    }

    static int FindDuplicate(int[] nums){
        int ans = 0;
        Map<Integer,Integer> map = new TreeMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet() ){
            if (entry.getValue() > 1) {
                ans = entry.getKey();
            }
        }
       return ans;
    }
}
