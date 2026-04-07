import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stack = new int[n];
        int top = -1;
        for (int i = 0; i < n; i++) {
            String op = sc.next();
            if (op.equals("PUSH")) {
                stack[++top] = sc.nextInt();
            } else if (op.equals("POP")) {
                System.out.println(top < 0 ? "EMPTY" : stack[top--]);
            } else if (op.equals("PEEK")) {
                System.out.println(top < 0 ? "EMPTY" : stack[top]);
            } else {
                System.out.println(top + 1);
            }
        }
    }
}
