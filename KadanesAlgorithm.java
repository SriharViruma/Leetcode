public class KadanesAlgorithm {
    static int kadanes(int[] nums) {
        int maxi = 0;
        int sum = 0;    

        for(int num : nums){
            sum = sum + num;
            maxi = Math.max(maxi, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(kadanes(nums));
    }
}
