import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 입력 방어
            if (n <= 0) {
                System.out.println("합: 0");
                return;
            }
            // 누적곱과 누적합 초기화
            long fact = 1, sum = 0;

            // 1부터 n까지 순회하여 누적곱 및 그 누적곱을 누적합
            for (int num = 1; num <= n; num++) {
                fact *= num;
                sum += fact;
            }

            // 최종 누적합 출력
            System.out.println("합: " + sum);
        }
    }
}