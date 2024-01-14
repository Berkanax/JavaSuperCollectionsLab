package JavaZaawansowana._03_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Letter {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(12);
        integers.add(5);
        integers.add(7);
        integers.add(98);

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println("next: " + next);
        }
        for (Integer element : integers) {
            System.out.println("element: " + element);
        }
        System.out.println("integers size: " + integers.size());
        System.out.println("integers contains: " + integers.contains(12));
        System.out.println("integers get: " + integers.get(0));
        System.out.println("integers isEmpty: " + integers.isEmpty());
        System.out.println("integers indexOf: " + integers.indexOf(12));
        System.out.println("integers lastIndexOf: " + integers.lastIndexOf(12));

    }
}
