package week3.day2.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Object> arrayList = new ArrayList<Object>();
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add("Veer");
        System.out.println(arrayList);
        arrayList.add(0,"Nirusha");
        System.out.println(arrayList);
        System.out.println(arrayList.contains("Veer"));
        System.out.println(arrayList.indexOf("Veer"));
    }


}
