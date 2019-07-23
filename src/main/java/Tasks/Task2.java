package main.java.Tasks;

public class Task2 {

    public static String namePrint () {
        String name = "Sasha";
        String str = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                str += name + " ";
            }
            str += "\n";
        }
        return str;
    }

   }