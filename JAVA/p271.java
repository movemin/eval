import java.util.Scanner;
import java.util.StringJoiner;

public class p271 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            int[][] grid = new int[row][col];
            for (int i = 0; i < row; i++)
                for (int j = 0; j < col; j++) grid[i][j] = sc.nextInt();
            
            // joiner를 사용하여 공백 방지
            StringJoiner result = new StringJoiner(" ");

            // 바깥 for문은 열 순회
            for (int i = 0; i < col; i++) {

                // 누적합 초기화
                int sum = 0;

                // 안쪽 for문은 행 순회
                for (int j = 0; j < row; j++) {

                    // 누적합
                    sum += grid[j][i];
                }

                // 누적합 결과 joiner에 추가
                result.add(String.valueOf(sum));
            }

            // 최종 결과값 출력
            System.out.println("합: " + result);
        }
    }
}