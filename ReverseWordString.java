public class ReverseWordString {
    public static String reverseWords(String s) {
      
        String trimmed = "";
        String ans = s.trim();
        String[] str = ans.split("\\s+");
        for (int i = str.length-1; i >= 0; i--) {
            trimmed +=str[i]+" ";
        }

        return trimmed;
    }
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
}
