package task_6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> teachers = new ArrayList<>();
        teachers.add(0, "Ivan T.");
        teachers.add(1, "Maria Y.");
        teachers.add(2, "Alexander E.");
        teachers.add(3, "Ekaterina Y.");
        teachers.add(4, "Dmitry O.");

        System.out.println("Список учителей: ");

        for (String teacher : teachers) {
            System.out.println(teacher);
        }
            int best = best_teacher(teachers);
            int worst = worst_teacher(teachers);

            System.out.println("Индекс лучшего: " + best);
            System.out.println("Индекс худшего: " + worst);
        }
    public static int best_teacher(List<String> teachers) {
        return 3;
    }
    public static int worst_teacher(List<String> teachers) {
        return 1;
    }
}

