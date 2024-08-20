

public class PlusOne {
    public static int[] plusOne(int[] digits) {
       int len = digits.length;
       for(int i = len - 1;i >= 0;i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
       } 

       int[] ans = new int[len + 1];
       ans[0] = 1;
       return ans;

    }
    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        int[] ans = plusOne(digits);
        for (int i : ans    ) {
            System.out.print(i+" ");
        }
    }
}
