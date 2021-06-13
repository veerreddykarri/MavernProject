package week6.day2;

import org.testng.annotations.Test;

import java.util.NoSuchElementException;

public class RegressionTestCases {
    @Test
    public void createLead() {

        System.out.println("CreateLead");

    }

    @Test
    public void editLead() {

        System.out.println("Edit Lead");
        throw new NoSuchElementException();
    }

    @Test
    public void deleteLead() {

        System.out.println("Delete Lead");
    }

    @Test
    public void duplicateLead() {

        System.out.println("Duplicate Lead");
    }

    @Test
    public void mergeLead() {
        System.out.println("Merge Lead");

    }
}
