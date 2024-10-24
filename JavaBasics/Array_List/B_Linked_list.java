package Array_List;

import java.util.LinkedList;

public class B_Linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l2.add(15);

        l1.addLast(999);

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
