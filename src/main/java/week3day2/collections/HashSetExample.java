package week3day2.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(10);
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        System.out.println(hashSet);
        System.out.println(hashSet.size());
        System.out.println(hashSet.contains(30));
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
