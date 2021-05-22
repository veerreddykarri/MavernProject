package VeerAdHocExercises.Dropdowns.week3.day1;

public class SmartPhone extends AndriodPhone{
    public void connectWhatsApp(){
        System.out.println("Connect to WhatsApp");
    }
    public void takeVideo(){
        System.out.println("Take Video from smartphone");
    }

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.connectWhatsApp();
        smartPhone.takeVideo();
        smartPhone.makeCall();
        smartPhone.sendMsg();
        smartPhone.saveContact();
    }
}
