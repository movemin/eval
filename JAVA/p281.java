import java.util.Scanner;
import java.util.StringJoiner;

public class p281 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[][] grid = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) grid[i][j] = sc.nextInt();

            // 시계방향 90도 회전: rotated[j][n-1-i] = grid[i][j]
            int[][] rotated = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    rotated[j][n - 1 - i] = grid[i][j];

            // 결과 출력
            for (int[] row : rotated) {
                StringJoiner rowNums = new StringJoiner(" ");
                for (int col : row)
                    rowNums.add(String.valueOf(col));
                System.out.println(rowNums);
            }
        }
    }
}