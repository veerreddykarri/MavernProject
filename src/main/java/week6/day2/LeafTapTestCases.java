package week6.day2;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class LeafTapTestCases {
    @Test(groups = {"smoke","functional"})
    public void createLead() throws Exception {

        System.out.println("CreateLead");
        throw new Exception();

    }

    @Test(groups = {"smoke","functional"})
    public void editLead() {

        System.out.println("Edit Lead");
    }

    @Test(groups = {"regression"}, dependsOnGroups = "smoke")
    public void deleteLead() {

        System.out.println("Delete Lead");
    }

    @Test(groups = {"functional"}, dependsOnGroups = "smoke")
    public void duplicateLead() {

        System.out.println("Duplicate Lead");
    }

    @Test(groups = {"regression"}, dependsOnGroups = "smoke")
    public void mergeLead() {
        System.out.println("Merge Lead");

    }

}
