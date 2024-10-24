package SomeProblems;

import java.util.Scanner;
import java.util.Random;

class Game {
    public int number;
    public int inputnumber;
    public int nofguess = 0;

    Game() {
        Random rn = new Random();
        number = rn.nextInt(100);
    }
    public void takeinputnumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number: ");
        inputnumber = sc.nextInt();
    }


    boolean r8() {
        nofguess++;
        if (inputnumber == number) {
            System.out.printf("Right! attempt: %d", nofguess);
            return true;
        }
        else if (inputnumber > number) {
            System.out.println("Too high...");
        }
        else {
            System.out.println("Too low....");
        }
        return false;
    }
}

    class Guess {
    public static void main(String[] args) {

        Game g = new Game();
        boolean b = false;
        while (!b){
            g.takeinputnumber();
            b = g.r8();
        }
    }
}
