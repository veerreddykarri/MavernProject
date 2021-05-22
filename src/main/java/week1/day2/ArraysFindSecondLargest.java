package week1.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysFindSecondLargest {
    public static void main(String[] args) {
        int values[] = {1,6,10,20,0};
        Arrays.sort(values);
        int length = values.length;
        System.out.println(values[length-2]);
    }

}
