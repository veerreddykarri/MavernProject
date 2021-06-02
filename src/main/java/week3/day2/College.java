package week3.day2;

public class College extends University{

    @Override
    void ug() {
        System.out.println("Undergraduate");
    }

    public static void main(String[] args) {
        University college = new College();
        college.pg();
        college.ug();
    }
}
