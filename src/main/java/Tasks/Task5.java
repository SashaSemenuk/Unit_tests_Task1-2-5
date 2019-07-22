package main.java.Tasks;

public class Task5 {

    public String revertString(String st) {
        String result = "";
        char symbols[] = st.toCharArray();
        for (int i=symbols.length-1; i>=0; i--) {
            result += symbols[i];
        }

        return result;
    }
}
