import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 바깥 반복문 행 반복
        for (int row = 1; row <= n; row++) {
            int rowSum = 0;

            // 안쪽 반복문 열을 반복하여 출력 및 누적합
            for (int j = 0; j <= n - 1; j++) {
                System.out.print((row + j) + " ");
                rowSum += (row + j);
            }

            // 행 덧셈 결과값 출력
            System.out.println("= " + rowSum);
        }
    }
}