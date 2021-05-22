package VeerAdHocExercises.Dropdowns.week3.day1;

public class Calculator {
    public void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    public void add(int num1,int num2,int num3){
        System.out.println(num1+num2+num3);
    }
    public void multiply(int num1,int num2){
        System.out.println(num1*num2);
    }
    public void multiply(int num1,double num2){
        System.out.println(num1*num2);
    }
    public void subtract(int num1,int num2){
        System.out.println(num2-num1);
    }
    public void subtract(double num1,double num2){
        System.out.println(num2-num1);
    }
    public void divide(int num1,int num2){
        System.out.println(num1/num2);
    }
    public void divide(int num1,double num2){
        System.out.println(num2/num1);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(5,5);
        calculator.add(5,5,5);
        calculator.multiply(5,50000);
        calculator.multiply(5,5.5);
        calculator.subtract(5,25);
        calculator.subtract(5.5,7.5);
        calculator.divide(7,35);
        calculator.divide(7,35.5);
    }

}
