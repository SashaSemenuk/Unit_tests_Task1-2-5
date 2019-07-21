package main.java.Tasks;

public class Task1 {

    public static void main(String[] args)
    {
        int a = 2, b = 3, c = 5;

        System.out.println("Min is " + min(a, b, c));

    }
    public static int min(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;

        }
    }
}


