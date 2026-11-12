import java.util.Scanner;

public class p294 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[][] grid = new int[n][n];
            for (int row = 0; row < n; row++)
                for (int col = 0; col < n; col++) grid[row][col] = sc.nextInt();

            // 플래그 변수로 대칭 판정 (변수명을 isSymmetric 으로 명확히)
            boolean isSymmetric = true;

            // 행 순회 — 대칭 아님이 확정되면 외부 루프도 즉시 종료
            outer:
            for (int row = 0; row < n; row++) {

                // 열 순회 — col = row+1 부터 시작해 각 쌍을 한 번만 비교
                for (int col = row + 1; col < n; col++) {
                    if (grid[row][col] != grid[col][row]) {
                        isSymmetric = false;
                        break outer; // 외부 루프까지 한 번에 탈출
                    }
                }
            }

            // 판정
            if (isSymmetric) {
                System.out.println("판정: 대칭");
            } else {
                System.out.println("판정: 대칭 아님");
            }
        }
    }
}