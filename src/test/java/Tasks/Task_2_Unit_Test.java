package test.java.Tasks;

import main.java.Tasks.Task2;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.Assert.assertFalse;

public class Task_2_Unit_Test {

    @Test
    public void Test1() {

        Task2 v = new Task2();
        String name = "Sasha";
        String x = "";
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                x += name + " ";
            }
            x += "\n";
        }
         assertEquals(x, v.main());
    }

    @Test
    public void Test2() {

        Task2 v = new Task2();
        String s = " ";
        assertFalse(Boolean.parseBoolean(s), v.main());
    }

}