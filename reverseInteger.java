public class reverseInteger {
    static int reverse(int n) {
        int reversed = 0;
        String s = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        int left = 0;
        int last = s.length() - 1;

        if (s.charAt(0) == '-') {
            sb.append(s.charAt(0));
            left++;
        }

        while (last >= left && s.charAt(last) == '0') {
            last--;
        }
        while (last >= left) {

            sb.append(s.charAt(last));
            last--;
        }
        s = sb.toString();
        reversed = Integer.parseInt(s);
        return reversed;
    }

    static int mathReverse(int x) {
        int reverse = 0;

        while (x != 0) {
            reverse = (reverse * 10) + x % 10;
            x = x / 10;
        }

        return x%10 == reverse % 10 ? reverse : 0;
    }

    public static void main(String[] args) {
        int x = 1534236469;
        // System.out.println(reverse(x));
        System.out.println(mathReverse(x));
    }
}
