package week3.day2;

public class Desktop implements Hardware,Software{
    public void desktopModel(){
        System.out.println("Desktop Model");
    }
    @Override
    public void hardwareResources() {
        System.out.println("Hardware Resources Implemented");
    }

    @Override
    public void softwareResources() {
        System.out.println("Software Resources Implemented");
    }

    public static void main(String[] args) {
        Desktop desktop = new Desktop();
        desktop.hardwareResources();
        desktop.softwareResources();
        desktop.desktopModel();
    }
}
