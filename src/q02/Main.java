import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] row = new long[n];
        row[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 1; j--) row[j] += row[j - 1];
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                if (j > 0) sb.append(' ');
                sb.append(row[j]);
            }
            System.out.println(sb);
        }
    }
}
