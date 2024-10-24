package TryCatch;
import java.util.Scanner;

public class B_NestedTryCatch {
    public static void main(String[] args) {
        int a = 30;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int b = sc.nextInt();
        try {
            try {
                int c = a/b;
                System.out.println("Answer: "  + c);
            }
            catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception occurred in 2nd layer.");
                System.out.println("Reason: " + e);
            }
            catch (Exception e){
                System.out.println("Random exception occurred in 2st layer.");
                System.out.println("Reason: " + e);
            }
        }
        catch (Exception e){
            System.out.println("Random exception occurred in 1st layer.");
            System.out.println("Reason: " + e);
        }
    }
}
