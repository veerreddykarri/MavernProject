package week1.day1;

public class Mobile {
    String mobileModel = "Iphone11";
    int mobileWeight = 25;
    boolean isFullCharge = true;
    double mobileCost = 1000.99;

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.makeCall();
        mobile.sendMSG();
        System.out.println(mobile.mobileModel);
        System.out.println(mobile.mobileWeight);
        System.out.println(mobile.isFullCharge);
        System.out.println(mobile.mobileCost);
    }

    public void makeCall() {
        System.out.println("Method to make call");
    }

    public void sendMSG() {
        System.out.println("Method to send message");
    }
}
