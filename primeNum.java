import java.util.Scanner;
public class primeNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int n = scan.nextInt();
        for (int i = 2; i < n; i++) {
            int prime = 1;
            int max = (int)Math.sqrt(i);
            for (int j = 2; j <= max; j++) {
                if(i % j == 0){
                    prime = 0;
                    break;
                }
            }
            if(prime == 1)
                System.out.println(i+" ");
            }
            scan.close();
        }
        
    }
