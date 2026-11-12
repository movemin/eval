import java.util.Scanner;
import java.util.StringJoiner;

public class p289 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            int[][] grid = new int[row][col];

            // 격자 입력
            for (int i = 0; i < row; i++)
                for (int j = 0; j < col; j++) grid[i][j] = sc.nextInt();

            // 대각선 d = i+j 순서로 순회 (d: 0 ~ row+col-2)
            for (int d = 0; d <= row + col - 2; d++) {
                int diagStart = Math.max(0, d - col + 1); // 유효한 행 범위 시작
                int diagEnd   = Math.min(row - 1, d);     // 유효한 행 범위 끝

                StringJoiner rowResult = new StringJoiner(" ");
                for (int i = diagStart; i <= diagEnd; i++) {
                    rowResult.add(String.valueOf(grid[i][d - i])); // 문자열 변환 명시
                }
                System.out.println(rowResult);
            }
        }
    }
}