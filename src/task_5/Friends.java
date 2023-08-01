package task_5;

import java.util.ArrayList;
import java.util.Collections;

public class Friends {
    ArrayList<String> list = new ArrayList<>();

    public void method() {
        list.add(0, "Ivan");
        list.add(1, "Maria");
        list.add(2, "Alexander");
        list.add(3, "Ekaterina");
        list.add(4, "Dmitry");
        list.add(5, "Anastasia");
        list.add(6, "Sergey");
        list.add(7, "Yulia");
        list.add(8, "Pavel");
        list.add(9, "Olga");
        list.add(10, "Roman");
        list.add(11, "Tatiana");
        list.add(12, "Mikhail");
        list.add(13, "Elena");
        list.add(14, "Andrey");

        System.out.println("Список имен: ");

        for (String element : list){
            System.out.println(element);
        }

        System.out.println("\nСписок имен в алфавитном порядке: ");
        Collections.sort(list);
        for (String element : list){
            System.out.println(element);
        }


    }
}