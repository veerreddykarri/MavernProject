package week2.day2.Assignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubsetWithParameter {
    public static void main(String[] args) {
        // create the first Hashset
        int[] setAvalues = {1,2,3};
        Set<Integer> setA = new HashSet<Integer>();
        for (Integer addValuesToSetA: setAvalues) {
            setA.add(addValuesToSetA);
        }
        // create the second Hashset
        int[] setBvalues = {1,2,4,5};
        Set<Integer> setB = new HashSet<Integer>();
        for (Integer addValuesToSetB: setBvalues) {
            setB.add(addValuesToSetB);
        }
        // check if setB is a subset of setA
        boolean result = setB.containsAll(setA);
        System.out.println("Is setB is subset of setA? " + result);
    }
}
