import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] tokens = line.trim().split("\\s+");
        int[] stack = new int[tokens.length];
        int top = -1;
        for (String t : tokens) {
            if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {
                int b = stack[top--], a = stack[top--];
                if (t.equals("+")) stack[++top] = a + b;
                else if (t.equals("-")) stack[++top] = a - b;
                else if (t.equals("*")) stack[++top] = a * b;
                else stack[++top] = a / b;
            } else {
                stack[++top] = Integer.parseInt(t);
            }
        }
        System.out.println(stack[top]);
    }
}
