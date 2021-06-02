package week3.day2.Assignments;

import java.util.Arrays;

public class MissingElementInAArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,9,10};
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            if (i+1 != arr[i]){
                System.out.println(i+1);
                break;
            }
        }
    }
}
