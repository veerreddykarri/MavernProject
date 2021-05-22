package week1.day1.assignments;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        int input = 31;
        int count = 0;
        for (int i = 1;i <= input;i++){ // Prime number is only divisible by 1 and it self(if count = 2 prime number)
            if (input % i==0){
                count = count + 1;
            }
        }
        if (count == 2)
            System.out.println("It is prime Number");
        else
            System.out.println("It is not a prime number");
    }
}
