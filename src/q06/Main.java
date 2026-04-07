import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(' ');
            System.out.print(a);
            long t = a + b; a = b; b = t;
        }
        System.out.println();
    }
}
