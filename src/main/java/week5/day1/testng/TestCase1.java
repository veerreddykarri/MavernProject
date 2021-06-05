package week5.day1.testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 extends BaseClass{
    @BeforeMethod
    public void preCondition() {
        System.out.println("beforemethod - TestCases1");

    }

    @Test
    public void test1() {
        System.out.println("test1");

    }
}
