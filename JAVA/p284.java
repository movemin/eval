import java.util.Scanner;

public class p284 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            int[][] grid = new int[row][col];
            for (int i = 0; i < row; i++)
                for (int j = 0; j < col; j++) grid[i][j] = sc.nextInt();
            int row1 = sc.nextInt(); int col1 = sc.nextInt();
            int row2 = sc.nextInt(); int col2 = sc.nextInt();

            // 누적합 초기화
            long sum = 0;

            // 입력받은 시작 행에서 끝 행까지의 인덱스 순회
            for(int i = row1; i <= row2; i++) {

                // 입력받은 시작열에서 끝 열까지의 인덱스를 순회
                for(int j = col1; j <= col2; j++) {

                    // 누적합
                    sum += grid[i][j];
                }
            }

            // 최종 부분 사각형 합 결과 출력
            System.out.println("부분 합: " + sum);
        }
    }
}