import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 실수 타입으로 합계 초기화
            double sum = 0.0;

            // 1부터 n까지 순회하여 1 / 순회변수 제곱 누적합
            for (int num = 1; num <= n; num++) {
                sum += 1.0 / (long) (num * num);
            }

            // 최종 누적합 출력
            System.out.printf("합: %.6f%n", sum);
        }
    }
}