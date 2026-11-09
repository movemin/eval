import java.util.Scanner;
import java.util.StringJoiner;

public class p278 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            int[][] grid = new int[row][col];
            for (int i = 0; i < row; i++)
                for (int j = 0; j < col; j++) grid[i][j] = sc.nextInt();
            
            // 마지막 공백 방지
            StringJoiner result = new StringJoiner(" ");

            // 바깥 반복문은 열 반복
            for (int i = 0; i < col; i++) {

                // 최대값 초기값으로 행 0으로 고정
                int max = grid[0][i];

                // 행 인덱스 순회하여 최댓값 갱신
                for (int j = 1; j < row; j++) {
                    if (grid[j][i] > max) {
                        max = grid[j][i];
                    }
                }

                // joiner에 추가
                result.add(String.valueOf(max));
            }

            // 최종 최댓값 출력
            System.out.println("최댓값: " + result);
        }
    }
}