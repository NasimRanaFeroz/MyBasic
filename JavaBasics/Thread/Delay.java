package Thread;
class delays extends Thread{
    public void run() {
        while (true){
            try {
                Thread.sleep(500);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Delaying this");
        }
    }
}
class norm extends Thread{
    public void run() {
        while (true){
            System.out.println("I'm normal");
        }
    }
}

public class Delay {
    public static void main(String[] args) {
        delays d = new delays();
        norm n = new norm();
        d.start();
        n.start();
    }
}
