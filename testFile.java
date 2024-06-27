public class testFile {
   public static boolean check(int[] nums, int k) {
        int NumsSize = nums.length;
        if(NumsSize == k) 
            return false;
        if(NumsSize % k == 0){
            return true;
        } 
        else
            return false;
    }
    
    public static void main(String[] args) {
        int[] nums = {2,5,6,8,9,10};
        int k = 3;
        boolean result = check(nums, k);
        System.out.println(result);
    }
}
