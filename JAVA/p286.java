import java.util.Scanner;

public class p286 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            int[][] grid = new int[row][col];
            for (int i = 0; i < row; i++)
                for (int j = 0; j < col; j++) grid[i][j] = sc.nextInt();
            
            // 짝수칸 홀수칸 초기화
            int even = 0;
            int odd = 0;

            // 행, 열 인덱스 순회하여 칸이 짝수인지 홀수인지에 따라 다른 변수에 합산
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if ((i + j) % 2 == 0) {
                        even += grid[i][j];
                    }
                    else {
                        odd += grid[i][j];
                    }
                }
            }

            // 최종 결과값 출력
            System.out.println("짝수 합: " + even);
            System.out.println("홀수 합: " + odd);
        }
    }
}