public class SeniorCitizen {
    public static int countSeniors(String[] details) {
            int count = 0;
            for (String i : details) {
                int check = 0;
                check = Integer.parseInt(i.substring(11,13));
                if (check > 60) {
                    count++;
                }
            }

            return count;

    }

    public static void main(String[] args) {
        String[] details = { "7868190130M7522", "5303914400F9211", "9273338290F4010" };
        System.out.println(countSeniors(details));
    }
}
