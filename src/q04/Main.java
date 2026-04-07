import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            boolean prime = x > 1;
            for (int j = 2; j * j <= x; j++) if (x % j == 0) { prime = false; break; }
            int sum = 1;
            for (int j = 2; j * j <= x; j++) if (x % j == 0) { sum += j; if (j != x / j) sum += x / j; }
            boolean perfect = x > 1 && sum == x;
            if (prime && perfect) System.out.println("Both");
            else if (prime) System.out.println("Prime");
            else if (perfect) System.out.println("Perfect");
            else System.out.println("Neither");
        }
    }
}
