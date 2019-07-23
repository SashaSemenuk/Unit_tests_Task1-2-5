package test.java.Tasks;

import main.java.Tasks.Task1;
import main.java.Tasks.Task2;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.Assert.*;

public class Task_2_Unit_Test {
    private Task2 v;

    @BeforeMethod
    public void beforeTest() {
        v = new Task2();
    }

    @Test
    public void Test1() {

        String name = "Sasha";
        String x = "";
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                x += name + " ";
            }
            x += "\n";
        }
         assertEquals(x, v.namePrint());
    }

    @Test
    public void Test2() {

        String name = "Sasha";
        String x = "";
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 10; j++) {
                x += name + " ";
            }
            x += "\n";
        }
         assertNotEquals(x, v.namePrint());
    }
    @Test
    public void Test3() {
        assertEquals(305, v.namePrint().length());
    }

}