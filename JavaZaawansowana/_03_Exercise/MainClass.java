package JavaZaawansowana._03_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainClass {

    public static void main(String[] args) {
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(52);
        listInteger.add(70);
        listInteger.add(50);
        listInteger.add(58);
        listInteger.add(52);
        duplicatorRemover(listInteger);

    }
    public static List<Integer> duplicatorRemover (List<Integer> duplicator) {
        System.out.println(duplicator);
        Set<Integer> set = new TreeSet<>(duplicator);
        System.out.println(set);
        List<Integer> mapping = new ArrayList<>(set);
        return mapping;
    }
}
