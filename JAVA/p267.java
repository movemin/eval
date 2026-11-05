import java.util.Scanner;
import java.util.StringJoiner;

public class p267 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            int[][] grid = new int[r][c]; // 'g' → 'grid' 로 변경해 의미를 명확히
            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++) grid[i][j] = sc.nextInt();

            // 각 행을 공백으로 구분하여 한 줄씩 출력
            for (int i = 0; i < r; i++) {
                StringJoiner sj = new StringJoiner(" ");
                for (int j = 0; j < c; j++) {
                    sj.add(String.valueOf(grid[i][j]));
                }
                System.out.println(sj);
            }
        }
    }
}