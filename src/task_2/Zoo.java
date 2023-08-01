package task_2;

import java.util.ArrayList;

public class Zoo {
    ArrayList<String> arrayList = new ArrayList<>();
    public int method () {
        arrayList.add(0, "animal1");
        arrayList.add(1, "animal2");
        arrayList.add(2, "animal3");
        arrayList.add(3, "animal4");
        arrayList.add(4, "animal5");
        arrayList.add(5, "animal6");
        arrayList.add(6, "animal7");
        arrayList.add(7, "animal8");
        int length = arrayList.size();
        System.out.println(length);
        System.out.println(arrayList);
        return arrayList.size();
    }
//    Метод для задания №3
    public void method_task3(){
        arrayList.remove (2);
        arrayList.remove (3);
        arrayList.remove (4);
        int length = arrayList.size();
        System.out.println(length);
        System.out.println(arrayList);
    }
}