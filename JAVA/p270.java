import java.util.Scanner;
import java.util.StringJoiner;

public class p270 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            int[][] grid = new int[row][col];

            // 격자 입력 받기
            for (int i = 0; i < row; i++)
                for (int j = 0; j < col; j++) grid[i][j] = sc.nextInt();

            // 공백 방지
            StringJoiner sj = new StringJoiner(" ");

            // 각 행 누적합 후 join
            for (int i = 0; i < row; i++) {
                int sum = 0;
                for (int j = 0; j < col; j++) {
                    sum += grid[i][j];
                }
                sj.add(String.valueOf(sum));
            }

            // 최종값 출력
            System.out.println("합: " + sj);
        }
    }
}