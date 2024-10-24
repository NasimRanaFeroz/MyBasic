package SomeProblems;

import java.util.Scanner;
public class MathProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", a, i, a * i);
        }
        int b = 12;
        for (int i = 10; i > 0; i--) {
            System.out.printf("%d X %d = %d\n", b, i, b * i);
        }

        System.out.print("Enter a number: ");
        int c = sc.nextInt();
        int fac = 1;
        for (int i = c; i >= 1; i--) {
            fac = fac * i;
        }
        System.out.printf("The factorial of %d is = %d", a, fac);

        System.out.print("Enter a number: ");
        int m = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += (m * i);
        }
        System.out.println(sum);
    }

}
