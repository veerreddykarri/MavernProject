package week3day2.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSetExercise {
    public static void main(String[] args) {
        List<String> aList = Arrays.asList("Hi", "EveryOne", "Wishes", "For", "Future","Future");
        Set<String> hSet = new HashSet<String>();
        for (String eachElmnt : aList) {
            hSet.add(eachElmnt);
        }
        System.out.println(hSet);
//        Method 2 (Using constructor)
//       ---------------------------
        List<String> aList1 = Arrays.asList("Hi", "EveryOne", "Wishes", "For", "Future");
        Set<String> hSet1 = new HashSet<String>(aList1);
        for (String eachElement:hSet1) {
            hSet1.add(eachElement);
        }
        System.out.println(hSet1);


//        Method 3 (Using addAll method)
//        ------------------------------
        List<String> aList2 = Arrays.asList("Hi", "EveryOne", "Wishes", "For", "Future");
        Set<String> hSet2 = new HashSet<String>();
        hSet2.addAll(aList2);
        System.out.println(hSet2);

    }
}
