package SomeBasic;

import java.util.Scanner;
public class Literals {
    public static <string> void main(String[] args) {

          byte age = 34;
          char ch = 'a';
          float f1 = 5.66f;
          long l = 444444L;
          boolean bnb = false;
          double d1 = 45.44;
          String str = "Nasim";
          System.out.println(str);

          int a = 5;
          System.out.println(a++);
          System.out.println(a);
          System.out.println(++a);

          Scanner sc = new Scanner(System.in);

          System.out.print("Enter the number: ");
          float b = sc.nextFloat();

          String n = "Nasim Rana";
          int m = n.length();
          String o = n.toLowerCase();
          String p = n.toUpperCase();
          String k = n.trim();
          System.out.println(m);
          System.out.println(o);
          System.out.println(n.toUpperCase());
          System.out.println(k);
          System.out.println(n.substring(3 , 7));
          System.out.println(n.replace("n" , "po"));
          System.out.println(n.endsWith("hjd"));
          System.out.println(n.charAt(4));
          System.out.println(n.equalsIgnoreCase("NASim"));
          System.out.println(n.indexOf("a" , 5));
          System.out.println(n.lastIndexOf("a" , 4));
          System.out.print("Write a word: ");
          String z = sc.nextLine();
          System.out.println(z.toLowerCase());
    }
}
