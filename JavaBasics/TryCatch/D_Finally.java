package TryCatch;

public class D_Finally {
    public static void main(String[] args) {
         int a = 12;
         int b = 5;
         while (true){
             try {
                 System.out.println(a/b);
             }
             catch (Exception e){
                 System.out.println("Exception: " + e);
                 break;
             }
             finally {
                 System.out.println("I'm the end of this program.");
             }
             b--;
         }
    }
}
