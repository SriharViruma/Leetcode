import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        Set<List<Integer>> set = new HashSet<List<Integer>>();
        int first = 0;
        int k = 0, balance = 0;
        
        while (first != nums.length-2) {
            int second = first + 1;
            int third = nums.length - 1;
        
            while (second < third) {
                balance = k - nums[first];
                int sum = nums[second] + nums[third];
                
                if (balance == sum) {
                    List<Integer> innerList = new ArrayList<>();
                    innerList.add(nums[first]);
                    innerList.add(nums[second]);
                    innerList.add(nums[third]);
                    
                    set.add(innerList);
                
                    third--;
                    second++;
                }
                if (sum < balance)
                second++;
            else
                third--;
                
           } 
           first++;
           
        }
        
        for (List<Integer> list2 : set) {
            list.add(list2);
        }

        return list;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
                    //-4 -1 -1 0 1 2
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list = threeSum(nums);
        System.out.println(list);

    }
}
