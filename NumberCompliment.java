public class NumberCompliment {
    public static int findComplement(int num){
        int ans = 0;

        String n = Integer.toBinaryString(num);
        String convetedBinary = "";
        for (int i = 0; i < n.length();i++) {
            if (n.charAt(i) == '0') {
                convetedBinary += '1';
            }
            else
                convetedBinary += '0';
        }

        ans = Integer.parseInt(convetedBinary,2);

        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        int m = 1;
        System.out.println(findComplement(n));
        System.out.println(findComplement(m));
    }
}
