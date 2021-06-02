package week3.day1.org.system;

public class Desktop extends Computer {
    public void desktopSize(){
        System.out.println("Desktop method");
    }

    public static void main(String[] args) {
        Desktop desktop = new Desktop();
        desktop.desktopSize();
        desktop.computerModel();
    }

}
