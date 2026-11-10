import java.util.Scanner;

public class p283 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            int[][] grid = new int[row][col];
            for (int i = 0; i < row; i++)
                for (int j = 0; j < col; j++) grid[i][j] = sc.nextInt();

            // 누적합 초기화
            int sum = 0;

            // 행 열 순회 후 누적합
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (i == 0 || i == row - 1 || j == 0 || j == col - 1) {
                        sum += grid[i][j];
                    }
                }
            }

            // 최종 누적합 출력
            System.out.println("테두리 합: " + sum);
        }
    }
}