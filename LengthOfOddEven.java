import java.util.HashMap;
public class LengthOfOddEven {
    public static int StringToArray(String S){
        HashMap<Character, Integer> hmap = new HashMap<>();

            int val = 0;
            boolean isOdd = false;
        for (int i = 0; i < S.length(); i++) {
           hmap.put(S.charAt(i),hmap.getOrDefault(S.charAt(i),0)+1);
        }
            for (int i : hmap.values()) {
                if (i % 2 != 0)
                {
                    val += i-1;
                    isOdd = true;
                }
                else
                    val += i;
            }
            if (isOdd) val++;

        return val;
    }

    public static void main(String[] args) {
        String S  = "aaabbbcccddd";
        System.out.println(StringToArray(S));
    }
}
