import java.util.Scanner;
import java.util.StringJoiner;

public class p295 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            int k = sc.nextInt();

            // 행렬 A (r x c) 입력
            int[][] matrixA = new int[r][c];
            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++) matrixA[i][j] = sc.nextInt();

            // 행렬 B (c x k) 입력
            int[][] matrixB = new int[c][k];
            for (int i = 0; i < c; i++)
                for (int j = 0; j < k; j++) matrixB[i][j] = sc.nextInt();

            // 행렬 곱 계산: result = A · B (r x k)
            long[][] result = new long[r][k];
            for (int i = 0; i < r; i++)
                for (int j = 0; j < k; j++)
                    for (int t = 0; t < c; t++)
                        result[i][j] += matrixA[i][t] * matrixB[t][j];

            // 결과 출력
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < r; i++) {
                StringJoiner rowResult = new StringJoiner(" ");
                for (int j = 0; j < k; j++)
                    rowResult.add(Long.toString(result[i][j])); // String.valueOf 보다 명시적
                sb.append(rowResult).append('\n');
            }
            System.out.print(sb);
        }
    }
}