package Tasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task_1_Unit_Test {

    @Test
    public void test() {
        Task1 v = new Task1();
        assertEquals (2, v.min(2, 3, 5));

    }
}