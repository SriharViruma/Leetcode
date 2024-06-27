import java.util.Vector;

public class RotArr {

    public static void main(String[] args) {
                    //0  1  2  3  4  5  6  7 len = 8 
        int[] nums = { -1 };

        int k = 2;

        k = k%nums.length;

        Vector<Integer> rotArr = new Vector<>();

        for (int i = 0; i < k; i++) {
            int value = nums.length - k+i;
            rotArr.add(nums[value]);
        }

        for (int i = 0; i < nums.length-k; i++) {
            rotArr.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rotArr.get(i);
        }
        for(int each : nums){
            System.out.print(each+" ");
        }

        
    }
}
