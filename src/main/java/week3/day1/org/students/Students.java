package week3.day1.org.students;

public class Students {
    public void getStudentInfo(String id){
        System.out.println(id);
    }
    public void getStudentInfo(String id,String name,String email,String phoneNumber){
        System.out.println(id);
        System.out.println(name);
        System.out.println(email);
        System.out.println(phoneNumber);
    }

    public static void main(String[] args) {
        Students students = new Students();
        students.getStudentInfo("IITB12346");
        students.getStudentInfo("IITB12345","Veer Karri","v.r@iitb.com","985654123");
    }
}
