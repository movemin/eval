import java.util.Scanner;

public class p297 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // 3D 배열 크기 입력 (층, 행, 열)
            int d = sc.nextInt();
            int r = sc.nextInt();
            int c = sc.nextInt();

            // 3D 배열 입력 읽기
            int[][][] grid = new int[d][r][c];
            for (int layer = 0; layer < d; layer++)
                for (int row = 0; row < r; row++)
                    for (int col = 0; col < c; col++)
                        grid[layer][row][col] = sc.nextInt();

            // 전체 원소 합산
            long sum = 0;
            for (int layer = 0; layer < d; layer++) {
                for (int row = 0; row < r; row++) {
                    for (int col = 0; col < c; col++) {
                        sum += grid[layer][row][col];
                    }
                }
            }

            System.out.println("합: " + sum);
        }
    }
}