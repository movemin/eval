import java.util.Scanner;
import java.util.StringJoiner;

public class p274 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            int[][] grid = new int[row][col];
            for (int i = 0; i < row; i++)
                for (int j = 0; j < col; j++) grid[i][j] = sc.nextInt();
            
            // 열의 수만큼 정수 순회
            for (int j = 0; j < col; j++) {

                // 행값 공백 구분
                StringJoiner rowResult = new StringJoiner(" ");
                for (int i = 0; i < row; i++) {
                    rowResult.add(String.valueOf(grid[i][j]));
                }

                // 최종 결과값 출력
                System.out.println(rowResult);
            }
        }
    }
}