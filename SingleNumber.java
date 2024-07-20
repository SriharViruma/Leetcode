class SingleNumber{
    public static void main(String[] args) {
        int[]  nums = {1};
        System.out.println(findMissing(nums));
    }
    static int findMissing(int[] nums){
        int ans = 0;

        for(int i = 0 ; i < nums.length; i++){
            ans = nums[i] ^ ans;
        }


        return ans;
    }
}