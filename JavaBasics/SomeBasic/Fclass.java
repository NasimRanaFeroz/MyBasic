package SomeBasic;

class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String n) {
        name = n;
    }
}
    class Phn {
        public void ring(){
            System.out.println("Ringing....");
    }
}
   class rect {
        int lenth;
        int width;
        public int area(){
            return lenth*width;
        }
        public int parameter(){
            return 2*(lenth + width);
        }
   }
public class Fclass {
    public static void main(String[] args) {
        Employee Nasim = new Employee();
        Nasim.setName("Nasim Rana Feroz");
        System.out.println(Nasim.getName());

        Nasim.salary = 2000;
        System.out.println(Nasim.getSalary());

        Phn Redmi = new Phn();
        Redmi.ring();
        rect ab = new rect();
        ab.lenth = 6;
        ab.width = 4;
        System.out.println(ab.area());
        System.out.println(ab.parameter());
    }
}
