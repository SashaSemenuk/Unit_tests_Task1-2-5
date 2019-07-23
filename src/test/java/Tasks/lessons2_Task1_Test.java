package test.java.Tasks;

import main.java.Tasks.lesson2_Task1;
import org.testng.annotations.Test;

public class lessons2_Task1_Test {
    @Test
    public  void Test1 (){
        lesson2_Task1 obj = new lesson2_Task1();
        obj.setAge(34);
        obj.setName("Sasha");

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getAgeGroup());
    }
}
