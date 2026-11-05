import java.util.Scanner;

public class p268 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            int[][] grid = new int[r][c];

            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++) grid[i][j] = sc.nextInt();

            // 격자 모든 원소의 합을 long으로 누적
            long sum = 0;
            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++) sum += grid[i][j];

            System.out.println("합: " + sum);
        }
    }
}