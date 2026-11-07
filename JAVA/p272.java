import java.util.Scanner;

public class p272 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[][] grid = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) grid[i][j] = sc.nextInt();

            // 대각선 합 초기화
            long sum = 0;

            // 행과 열의 인덱스가 같은 요소를 불러낸 뒤 누적합
            for(int i = 0; i < n; i++) {
                sum += grid[i][i];
            }

            // 최종 결과값 출력
            System.out.println("대각선 합: " + sum);
        }
    }
}