package TryCatch;

public class A_TryCatchBasic {
    public static void main(String[] args) {
        int a = 500;
        int b = 0;
        try {
            System.out.println("Answer is: " + a/b);
        }
        catch (Exception e){
            System.out.println("Failed to divide.");
            System.out.println("Reason: " + e);
        }
        System.out.println("End of the program.");
    }
}
