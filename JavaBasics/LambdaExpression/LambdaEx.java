package LambdaExpression;
@FunctionalInterface
interface lx {
    void math1();
}

public class LambdaEx {
    public static void main(String[] args) {
        lx obj = ()-> System.out.println("Great");
        obj.math1();
    }
}
