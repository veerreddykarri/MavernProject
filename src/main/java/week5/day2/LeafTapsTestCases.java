package week5.day2;

import org.testng.annotations.Test;

public class LeafTapsTestCases {
    @Test(invocationCount = 5,priority = 2) //Run the test case 100 times
    public void createLead(){
        System.out.println("CreateLead");
    }
    @Test(priority = 1)//if you don't give priority by default it is zero
    public void editLead(){
        System.out.println("EditLead");
    }
    @Test(priority = 3,enabled = false)//if you don't want to execute the test case
    public void mergeLead(){
        System.out.println("MergeLead");
    }
}
