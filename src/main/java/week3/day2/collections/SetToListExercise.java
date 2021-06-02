package week3.day2.collections;

import org.bouncycastle.util.Arrays;

import java.util.*;

public class SetToListExercise {
    public static void main(String[] args) {
        String[] a = {"Veer", "Nirusha", "Jiya"};
        Set<String> set = new HashSet<String>();
        for (String string:a) {
            set.add(string);
        }
        List<String> list = new ArrayList<String>(set);
      //  list.addAll(set);
        Collections.sort(list);
        System.out.println(list);
    }
}
