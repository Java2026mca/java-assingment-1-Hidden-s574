import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1, num = 1;
        while (num <= n * n) {
            for (int i = left; i <= right; i++) mat[top][i] = num++;
            top++;
            for (int i = top; i <= bottom; i++) mat[i][right] = num++;
            right--;
            for (int i = right; i >= left; i--) mat[bottom][i] = num++;
            bottom--;
            for (int i = bottom; i >= top; i--) mat[i][left] = num++;
            left++;
        }
        int diag = 0;
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (j > 0) sb.append(' ');
                sb.append(mat[i][j]);
            }
            System.out.println(sb);
            diag += mat[i][i];
        }
        System.out.println("Diagonal: " + diag);
    }
}
