public class factorial {
    public static void main(String[] args) {
        int n = 6;
        long factorial = 1;
        for(int i = 2;i <= n;i++){
                factorial = factorial*i;
        }
        System.out.printf("factorial of %d = %d",n,factorial);
    }
}
