package JavaZaawansowana._03_Collections;

import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("Adrian");
        names.add("Piotr");
        names.add("Paweł");
        names.add("Jarek");
        names.add("Marek");
        names.add("Arek");
        names.add("Darek");

        for (String emement : names){
            System.out.println("element: " + emement);
        }
    }
}
