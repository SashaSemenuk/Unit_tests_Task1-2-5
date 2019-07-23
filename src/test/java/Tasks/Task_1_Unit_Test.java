package test.java.Tasks;

import main.java.Tasks.Task1;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task_1_Unit_Test {
    private Task1 v;

    @BeforeMethod
    public void beforeTest() {
        v = new Task1();
    }

    @Test
    public void test1Min() {

        assertEquals(0, v.min(0, 3, 5));
    }

    @Test
    public  void test2Min() {
        assertEquals(-3, v.min(-1, -2, -3));
    }

    @Test
    public  void test3Min() {

        assertEquals(-1, v.min(-1, 0, 1));
    }

    @Test
    public void test4Min() {
        assertEquals(0, v.min(0, -0, +0));
    }

}


