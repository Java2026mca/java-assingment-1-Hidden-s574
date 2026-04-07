import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n - i; j++) sb.append(' ');
            if (i == 1) {
                sb.append('*');
            } else {
                sb.append('*');
                for (int j = 0; j < 2 * i - 3; j++) sb.append(' ');
                sb.append('*');
            }
            System.out.println(sb);
        }
        for (int i = n - 1; i >= 1; i--) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n - i; j++) sb.append(' ');
            if (i == 1) {
                sb.append('*');
            } else {
                sb.append('*');
                for (int j = 0; j < 2 * i - 3; j++) sb.append(' ');
                sb.append('*');
            }
            System.out.println(sb);
        }
    }
}
