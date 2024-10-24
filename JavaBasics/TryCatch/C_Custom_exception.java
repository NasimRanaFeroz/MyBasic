package TryCatch;
import java.util.Scanner;

class maxAge extends Exception{
    @Override
    public String toString() {
        return "Age can not be greater than 125!";
    }

    @Override
    public String getMessage() {
        return "Make sure that you enter the correct age!";
    }
}

 class Custom_exception {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        a = sc.nextInt();
        try{
            if (a<=125) {
                System.out.println("Enjoy your life.");
            }
            else {
                throw new maxAge();
            }
            }
        catch (Exception e) {
            System.out.println("Exception occurred. Reason: " + e);
            System.out.println(e.getMessage());
                }
        }

    }

