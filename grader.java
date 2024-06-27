import java.util.Scanner;
public class grader {
    public static void main(String[] args) {
        char grade='a';
        System.out.println("Grade Finder");
        Scanner scanf = new Scanner(System.in);
        System.out.print("ENTER YOUR MARK: ");
        int mark = scanf.nextInt();
        if(mark >80){
            grade = 'A';
        }
        else if(mark >70){
            grade = 'B';
        }
        System.out.println(grade);
        scanf.close();
    }
}