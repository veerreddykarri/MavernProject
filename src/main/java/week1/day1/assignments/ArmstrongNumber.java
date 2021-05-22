package week1.day1.assignments;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int input = 370;
        int calculated =0;
        int remainder;
        int original = input;
        while (input > 0) {
            remainder = input % 10;
            input = input / 10;
            calculated = calculated +(remainder*remainder*remainder);
        }
        if (original==calculated)
            System.out.println("The Number is Armstrong Number");
        else
            System.out.println("The Number is not Armstrong Number");
    }
}
