public class SubsequenceStr {
    static boolean isSubsequence(String s, String t) {

        int index = 0;
        for (int i = 0; i < t.length() && index < s.length(); i++) {
            if (s.charAt(index) == (t.charAt(i))) {
                    index++;
            }
        }
    return index == s.length();
    }

    public static void main(String[] args) {
        String s = "gksrek";
        String t = "geeksforgeeks";
        System.out.println(isSubsequence(s, t));    
    }
}
