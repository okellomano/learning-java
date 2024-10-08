package org.eok;

import java.util.ArrayList;

public class ArrayListExample<I extends Number> {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        // add items
        list.add(90);
        list.add(950);
        list.add(654);

        System.out.println(list);
        System.out.println(list.contains(100));

        // get item at any index
        for (int i=0; i < 5; i++){
            System.out.println(list.get(i));
        }
    }
}
