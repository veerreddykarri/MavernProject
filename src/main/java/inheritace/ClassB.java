package inheritace;

public class ClassB extends ClassA{
    public void vijay(){
        System.out.println("Vijay Methord");
    }

    public static void main(String[] args) {
        ClassB praveen = new ClassB();
        praveen.manda();
        praveen.vijay();
    }

    @Override
    void raju() {

    }
}
