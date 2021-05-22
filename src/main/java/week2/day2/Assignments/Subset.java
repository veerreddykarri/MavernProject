package week2.day2.Assignments;

import java.util.HashSet;
import java.util.Set;

public class Subset {
    public static void main(String[] args) {
        // create the first set
        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(2);
        setA.add(4);
        System.out.println("setA: " + setA);
        // create the second set
        Set<Integer> setB = new HashSet<>();
        setB.add(2);
        setB.add(3);
        System.out.println("setB: " + setB);
        // check if setB is a subset of setA
        boolean result = setA.containsAll(setB);
        System.out.println("Is setB is subset of setA? " + result);
    }
}
