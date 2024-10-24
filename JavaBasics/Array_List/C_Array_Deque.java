package Array_List;

import java.util.ArrayDeque;

public class C_Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(21);
        ad1.add(22);
        ad1.add(23);
        ad1.add(24);
        ad1.add(25);
        ad1.offerFirst(1);
        ad1.pollLast();
        System.out.println(ad1.peekFirst());
        for (Integer ele : ad1){
            System.out.println(ele);
        }
    }
}
