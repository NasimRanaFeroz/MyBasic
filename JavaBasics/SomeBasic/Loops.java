package SomeBasic;

import java.util.Scanner;
public class Loops {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int a = sc.nextInt();
        if (a > 18) {
        System.out.println("Yes you can drive!");
    }
      else if (a < 18){
            System.out.println("No! You can not drive!");
        }
      else {
        System.out.println("You can but be careful!");
    }

        System.out.println("Enter your age again: ");
        int b = sc.nextInt();
        switch (b){
            case 18 -> System.out.println("You can");
            case 16 -> System.out.println("You can not");
            case 20 -> System.out.println("You surely can");
            default -> System.out.println("Enjoy your life");
        }

    }
}
