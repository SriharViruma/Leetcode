import java.util.HashMap;
import java.util.Map;

public class GoodPair {
     public static int numIdenticalPairs(int[] nums) {
      HashMap<Integer,Integer> map = new HashMap<>();
      int count = 0;
      
      for(int num : nums){
        map.put(num, map.getOrDefault(num,0)+1);
      }

      for(Map.Entry<Integer,Integer> entry : map.entrySet())  {
        int n = entry.getValue();
        count += n*(n-1)/2;
      }
      return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        System.out.println(numIdenticalPairs(nums));
    }
}
