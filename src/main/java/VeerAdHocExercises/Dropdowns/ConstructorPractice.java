package VeerAdHocExercises.Dropdowns;

public class ConstructorPractice {
    double studentNumber;
    String name;
    String department;
    ConstructorPractice(double studentNumber,String name){
        this("Mechanical Engineering");
        this.studentNumber = studentNumber;
        this.name = name;
    }
    ConstructorPractice(String department){
        this.department = department;
        System.out.println(department);
    }

    public void setStudentNumber(){
        System.out.println(studentNumber);
    }

    public static void main(String[] args) {
        ConstructorPractice constructorPractice = new ConstructorPractice(765,"Veer Karri");
        constructorPractice.setStudentNumber();
    }
}
