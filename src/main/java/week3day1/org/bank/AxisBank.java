package week3day1.org.bank;

public class AxisBank extends BankInfo{
    public void deposit(){
        System.out.println("deposit method in Axis Bank Class");
    }

    public static void main(String[] args) {
        AxisBank axisBank = new AxisBank();
        axisBank.deposit();
        axisBank.saving();
        axisBank.fixed();
    }
}
