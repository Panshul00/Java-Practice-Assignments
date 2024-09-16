package col_sort;

import java.util.ArrayList;

public class M1 {

    public static void main(String[] args) {
        
        ArrayList<Integer> li = new ArrayList<>();
        
        li.add(132);
        li.add(32);
        li.add(74);
        li.add(11);
        li.add(6);
        li.add(83);
        
        for (Integer s : li) {
            if (s % 2 == 1) {
                System.out.println(s);
            }
        }
    }
}
