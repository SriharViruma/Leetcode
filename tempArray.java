import java.util.Scanner;
public class tempArray {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
      //  int tempSum;
        System.out.print("How many days: ");
        int numDays = scanf.nextInt();
        int[] temps = new int[numDays];
       
        for (int i = 0; i < numDays; i++) {
            System.out.print("day"+(i+1)+"'s High temp: ");
            temps[i] = scanf.nextInt();
           // tempSum += temps[i];
        }
        scanf.close();
    }
    
}
