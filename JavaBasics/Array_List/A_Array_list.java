package Array_List;

import java.util.ArrayList;

public class A_Array_list {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l1.add(1);
        l1.add(2);
        l1.add(3);

        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l2.add(15);

        l1.add(0, 8);
        l1.add(2, 9);

        l1.addAll(0, l2);
        //l1.clear();
        System.out.println(l1.contains(11));
        System.out.println(l1.indexOf(15));
        l1.set(1,500);
        for (Integer element : l1) {
            System.out.println(element);
        }
    }
}
