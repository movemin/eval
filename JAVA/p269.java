import java.util.Scanner;

public class p269 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            int[][] grid = new int[row][col];

            // 격자 입력 받기
            for (int i = 0; i < row; i++)
                for (int j = 0; j < col; j++) grid[i][j] = sc.nextInt();

            // 최댓값 탐색: grid와 타입 일치를 위해 int 사용
            int max = grid[0][0];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (grid[i][j] > max) {
                        max = grid[i][j];
                    }
                }
            }

            System.out.println("최댓값: " + max);
        }
    }
}