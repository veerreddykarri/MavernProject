package week2.day2.Assignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubsetWithParameter {
    public static void main(String[] args) {
        // create the first set
        String[] setAvalues = {"1","2","3"};
        Set<String> setA = new HashSet<>(Arrays.asList(setAvalues));
        System.out.println("setA: " + setA);
        // create the second set
        String[] setBvalues = {"1","2","3","5"};
        Set<String> setB = new HashSet<>(Arrays.asList(setAvalues));
        System.out.println("setB: " + setB);
        // check if setB is a subset of setA
        boolean result = setA.containsAll(setB);
        System.out.println("Is setB is subset of setA? " + result);
    }
}
