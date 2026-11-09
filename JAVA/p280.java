import java.util.Scanner;
import java.util.StringJoiner;

public class p280 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            int[][] grid = new int[row][col];
            for (int i = 0; i < row; i++)
                for (int j = 0; j < col; j++) grid[i][j] = sc.nextInt();
            
            // 행 순회
            for (int i = 0; i < row; i++) {

                // 각 행 출력값 초기화
                StringJoiner rowResult = new StringJoiner(" ");

                // 열 순회하여 각 행 출력값에 join
                // row - 1 - i: 마지막 행부터 역순으로 접근
                for (int j = 0; j < col; j++) {
                    rowResult.add(String.valueOf(grid[row - 1 - i][j]));
                }

                // 행 출력값이 채워지면 바로 출력
                System.out.println(rowResult);
            }
        }
    }
}