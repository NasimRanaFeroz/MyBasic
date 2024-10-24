package Thread;

class Prior extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("I have priority");
        }
    }
}
class non extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("I am normal");
        }
    }
}
public class Priority {
    public static void main(String[] args) {
        Prior p = new Prior();
        non o = new non();

        p.setPriority(7);
        o.setPriority(4);

        p.start();
        o.start();
    }
}
