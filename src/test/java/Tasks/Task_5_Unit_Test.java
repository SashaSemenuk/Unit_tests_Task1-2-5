package test.java.Tasks;

import main.java.Tasks.Task2;
import main.java.Tasks.Task5;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.BitSet;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class Task_5_Unit_Test {
    private Task5 v;

    @BeforeMethod
    public void beforeTest() {
        v = new Task5 ();
    }

    @Test
    public void Test1() {
        String st = "Hello world!!!";
        assertEquals("!!!dlrow olleH", v.revertString(st));
    }

    @Test
    public void Test2() {
        String s = "!!!dlrow olleH";
        String lastChar = s.substring(s.length() - 1);
        assertEquals("H", v.revertString(lastChar));
    }

    @Test
    public void Test3() {
        String s = "!!!dlrow olleH";
        String lastChar = s.substring(s.length() - 5);
        assertEquals("Hello", v.revertString(lastChar));
    }

    @Test
    public void Test4() {
        String s = "!!!dlrow olleH";
        int len = s.length();
        assertEquals(len, v.revertString("Hello world!!!").length());
    }


}

