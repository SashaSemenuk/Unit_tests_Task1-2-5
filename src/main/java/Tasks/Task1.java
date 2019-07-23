package main.java.Tasks;

public class Task1 {

    public int min(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;

        }
    }
}


