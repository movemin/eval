import java.util.Scanner;
import java.util.StringJoiner;

public class p296 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            int k = sc.nextInt();

            int[][] grid = new int[rows][cols];
            for (int i = 0; i < rows; i++)
                for (int j = 0; j < cols; j++) grid[i][j] = sc.nextInt();

            // k가 cols 이상일 경우 실제 이동 칸 수로 정규화
            k %= cols;

            int[][] result = new int[rows][cols];
            // 각 원소를 k칸 오른쪽으로 이동
            for (int i = 0; i < rows; i++)
                for (int j = 0; j < cols; j++)
                    result[i][(j + k) % cols] = grid[i][j];

            // 결과 출력
            for (int i = 0; i < rows; i++) {
                StringJoiner rowResult = new StringJoiner(" ");
                for (int j = 0; j < cols; j++)
                    rowResult.add(String.valueOf(result[i][j]));
                System.out.println(rowResult);
            }
        }
    }
}