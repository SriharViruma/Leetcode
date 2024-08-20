public class TwoStringequivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String total1 = "";
        String total2 = "";

        for (String s : word1) {
            total1 += s;
        }
        for (String s : word2) {
            total2 += s;
        }
        if (total1.equals(total2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] word1 = { "abc", "d", "defg"};
        String[] word2 = { "abcddefg" };
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
}
