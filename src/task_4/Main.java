package task_4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> iterator = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            iterator.add(i);
        }
        for (Integer element : iterator) {
            System.out.print(element + " ");
        }
        System.out.println();
        ListIterator<Integer> listIterator = iterator.listIterator();
        while (listIterator.hasNext()) {
            Integer integer = listIterator.next() + 1;
            System.out.print(integer + " ");

        }
    }
}
