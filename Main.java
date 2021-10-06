import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StackGeneric<String> stack = new StackGeneric<>(33);
        String inp = "f(x) = (2x+y) - (3 + (2x-x) + 20)";
        Scanner s = new Scanner(inp);

        s.useDelimiter("");

        for (int b = 0; b < 33; b++){
        String Karakter = s.next();
        if (Karakter.equals("(")) {
            stack.push("(");
        } else if (Karakter.equals(")")) {
            stack.pop();
        }
    }
        if (stack.isEmpty()) {
            System.out.println("valid");
        } else {
            System.out.println("tidak valid");

        }
    }
}