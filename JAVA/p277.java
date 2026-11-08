import java.util.Scanner;

public class p277 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            int[][] grid = new int[row][col];
            for (int i = 0; i < row; i++)
                for (int j = 0; j < col; j++) grid[i][j] = sc.nextInt();

            // StringBuilder를 사용해 반복적인 String 객체 생성을 방지
            StringBuilder out = new StringBuilder("최댓값:");
            for (int i = 0; i < row; i++) {
                int max = grid[i][0]; // grid가 int[][]이므로 int로 충분
                for (int j = 1; j < col; j++) {
                    if (grid[i][j] > max) {
                        max = grid[i][j];
                    }
                }
                out.append(" ").append(max);
            }
            System.out.println(out);
        }
    }
}