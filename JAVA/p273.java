import java.util.Scanner;

public class p273 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[][] grid = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) grid[i][j] = sc.nextInt();

            // 반대각선 합 초기화
            long sum = 0;

            // 행과 열의 인덱스를 같은 값으로 하여 정수 불러와 누적합
            for(int row = 0; row < n; row++) {
                sum += grid[row][n - 1 - row];
            }

            // 최종 결과값 출력
            System.out.println("반대각선 합: " + sum);
        }
    }
}