import java.util.Scanner;

public class p285 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[][] g = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) g[i][j] = sc.nextInt();

            int[] rowMin = new int[n];
            int[] colMax = new int[n];

            // 각 행의 최솟값 계산
            for (int i = 0; i < n; i++) {
                int minVal = g[i][0];
                for (int j = 1; j < n; j++) {
                    if (g[i][j] < minVal) minVal = g[i][j];
                }
                rowMin[i] = minVal;
            }

            // 각 열의 최댓값 계산 (행/열 루프를 분리해 의도를 명확히 함)
            for (int j = 0; j < n; j++) {
                int maxVal = g[0][j];
                for (int i = 1; i < n; i++) {
                    if (g[i][j] > maxVal) maxVal = g[i][j];
                }
                colMax[j] = maxVal;
            }

            // 새들 포인트 카운트: 행 최솟값이면서 열 최댓값인 셀
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (g[i][j] == rowMin[i] && g[i][j] == colMax[j]) {
                        count++;
                    }
                }
            }

            System.out.println("새들 개수: " + count);
        }
    }
}