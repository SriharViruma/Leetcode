public class LongestSubSequence {

    public static int appendCharacters(String s, String t) {
        int count = t.length();
        int i = 0, j = 0;
       while (i  < t.length()){
           while (j < s.length()) {
               if (t.charAt(i) == s.charAt(j)) {
                   count--; i++; j++;
                   break;
               } else {
                   j++;
               }
           }
               if (j == s.length()){
                   break;
               }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "z" , t = "abcde";
        System.out.println(appendCharacters(s,t));
    }
}
