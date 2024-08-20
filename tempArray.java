import java.util.Scanner;
public class tempArray {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
      //  in tempSum;
      int maxi = 0;
        System.out.print("How many days: ");
        int numDays = scanf.nextInt();
        int[] temps = new int[numDays];
       
        for (int i = 0; i < numDays; i++) {
            System.out.print("day"+(i+1)+"'s High temp: ");
            temps[i] = scanf.nextInt();
        }
        for(int i : temps){
            maxi = Math.max(maxi,  i);
        }
        System.out.println(maxi);
        scanf.close();
    }
    
}
