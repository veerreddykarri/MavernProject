package week3.day2.Assignments;

import com.microsoft.schemas.vml.STExt;

import java.util.Arrays;

public class MoveAllZeros {
    public static void swap(int[] num, int i, int j)
    {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

    public static void partition(int[] num)
    {
        int j = 0;

        for (int i = 0; i < num.length; i++)
        {
            if (num[i] != 0)
            {
                swap(num, i, j);
                j++;
            }
        }
    }
    public static void main(String[] args)
    {
        int[] num = {4,0,3,0,1,5,2,0};
        partition(num);
        System.out.println(Arrays.toString(num));
    }
}
