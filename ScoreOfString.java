public class ScoreOfString {
    public static int scoreOfString(String s) {
        int total = 0;
        int difference = 0;

        for(int i = 0 ; i < s.length()-1;i++){
            difference = Math.abs(s.charAt(i)-s.charAt(i+1));
            System.out.println(difference);
            total += difference;
        }

        return total;
        
    }
    public static void main(String[] args) {
        String S = "zaz";
        System.out.println(scoreOfString(S));
        
    }
}
