import java.util.Scanner;

public class p275 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            int[][] grid = new int[row][col];
            for (int i = 0; i < row; i++)
                for (int j = 0; j < col; j++) grid[i][j] = sc.nextInt();
            int x = sc.nextInt();

            // 카운트 초기화
            int count = 0;

            // 행만큼 0부터 정수 순회
            for (int i = 0; i < row; i++) {

                // 열만큼 0부터 정수 순회
                for (int j = 0; j < col; j++) {

                    // 격자와 검색값이 같으면 카운트
                    if (grid[i][j] == x) {
                        count++;
                    }
                }
            }

            // 최종 카운트 출력
            System.out.println("개수: " + count);
        }
    }
}