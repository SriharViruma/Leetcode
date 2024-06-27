import java.util.Scanner;
public class ReadSalary {
    public static void main(String[] args) {
        double high;
        Scanner scanf = new Scanner(System.in);
        System.out.println("Enter 3 salaries");
        System.out.print("Enter Salary 1: ");
        double Salary1 = scanf.nextDouble();
        System.out.print("Enter Salary 2: ");
        double Salary2 = scanf.nextDouble();
        System.out.print("Enter Salary 3: ");
        double Salary3 = scanf.nextDouble();
        high = Salary1;
        if(Salary2>high){
            high = Salary2;
        }
        else if(Salary3>high){
            high = Salary3;
        }
        System.out.println(high+" is the highest salary");
        scanf.close();
    }
}
