package test.java.Tasks;

import main.java.Tasks.Task1;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task_1_Unit_Test {


    @Test
    public static void test1Min() {
        Task1 v = new Task1();
        assertEquals(0, v.min(0, 3, 5));
    }

    @Test
    public static void test2Min() {
        Task1 v = new Task1();
        assertEquals(-3, v.min(-1, -2, -3));
    }

    @Test
    public static void test3Min() {
        Task1 v = new Task1();
        assertEquals(-1, v.min(-1, 0, 1));
    }

    @Test
    public static void test4Min() {
        Task1 v = new Task1();
        assertEquals(0, v.min(0, -0, +0));
    }

}


