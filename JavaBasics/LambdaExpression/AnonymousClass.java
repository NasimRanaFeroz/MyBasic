package LambdaExpression;

interface anon{
    void math1();
    void math2();
}

public class AnonymousClass {
    public static void main(String[] args) {
        anon obj = new anon() {
            @Override
            public void math1() {
                System.out.println("I am math1");
            }

            @Override
            public void math2() {
                System.out.println("I am math2");
            }
        };
        obj.math1();
        obj.math2();
    }
}
