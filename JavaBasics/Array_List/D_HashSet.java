package Array_List;

import java.util.HashSet;

public class D_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(5, 0.5f);
        hs.add(31);
        hs.add(32);
        hs.add(33);
        hs.add(34);
        hs.add(35);
        System.out.println(hs);
    }
}
