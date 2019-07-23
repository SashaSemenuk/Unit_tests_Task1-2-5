package test.java.Tasks;

import main.java.Tasks.Task2;
import main.java.Tasks.Task5;
import org.testng.annotations.Test;

import java.util.BitSet;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class Task_5_Unit_Test {

    @Test
    public void Test1() {
        Task5 tesk1 = new Task5();
        String st = "Hello world!!!";
        assertEquals("!!!dlrow olleH", tesk1.revertString(st));
    }

    @Test
    public void Test2() {
        Task5 test2 = new Task5();
        String s = "!!!dlrow olleH";
        String lastChar = s.substring(s.length() - 1);
        assertEquals("H", test2.revertString(lastChar));
    }

    @Test
    public void Test3() {
        Task5 test3 = new Task5();
        String s = "!!!dlrow olleH";
        String lastChar = s.substring(s.length() - 5);
        assertEquals("Hello", test3.revertString(lastChar));
    }

    @Test
    public void Test4() {
        Task5 test4 = new Task5();
        String s = "!!!dlrow olleH";
//        int len = s.length();
        assertEquals(14, test4.revertString("Hello world!!!").length());
    }


    @Test
    public void Test5() {
        Task5 test4 = new Task5();
        assertNotNull(test4);
    }
}

