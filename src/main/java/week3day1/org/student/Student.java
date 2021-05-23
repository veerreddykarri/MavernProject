package week3day1.org.student;

import week3day1.org.department.Department;

public class Student extends Department {
    public void studentName(){
        System.out.println("Veer Karri");
    }
    public void studentDept(){
        System.out.println("Mechanical Engineering");
    }
    public void studentId(){
        System.out.println("IITB123456");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.studentDept();
        student.studentId();
        student.studentName();
        student.deptName();
        student.collegeCode();
        student.collegeRank();
        student.collegeName();
    }
}
