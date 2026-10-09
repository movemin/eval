import java.util.Scanner;

public class Main {

    // 제곱수 판별 클래스
    private static boolean isSquare(int number) {
        for (int j = 1; j * j <= number; j++){
            if (j * j == number) {
                return true;
            }
        }
        return false;
    }

    // main 스크립트
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum = 0;

            // 제곱수를 판별할 값 1부터 순회
            for (int num = 1; num <= n; num++) {
                
                // 제곱수가 아니면 누적합
                if (!isSquare(num)) {
                    sum += num;
                }
            }

            // 합계 출력
            System.out.println(sum);
        }
    }
}