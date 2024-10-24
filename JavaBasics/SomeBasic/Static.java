package SomeBasic;

import java.util.Scanner;
public class Static {
    static void Joke(){
    System.out.println("Haha!");
  }
    static int area(int a ,int b){
        return a*b;
    }
    static void multi(int n){
        for (int i=1; i<=10; i++){
            System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
    }
    static void pat(int a){
        for (int i=1; i<=a; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static int sum(int n){
        if(n==1){
            return 1;
        }
        else {
            return n + sum(n - 1);
        }
    }
     static int fib(int n){
         if (n==1){
             return 0;
         }
         else if (n==2) {
            return 1;
         }
         else {
             return fib(n-1) + fib(n-2);
         }
     }
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println(area(4,5));
        System.out.println(fib(5));
        int a = sum(6);
            System.out.println(a);
            pat(6);
            multi(4);
            Joke();

          int ab = 1;
          while (ab<9){
              System.out.println("Love you " + ab);
              if (ab == 3){
                  System.out.println("Hate you " + ab);
                  break;
              }
              ab++;
          }
          int ba = 0;
          while (ba<9){
              ba++;
              if (ba == 3){
                  System.out.println("Hate you " + ba);
                  continue;
              }
              System.out.println("Love you " + ba);
          }
    }
}
