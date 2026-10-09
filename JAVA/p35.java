import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            // 수도코드: 합계 변수 초기화; 1 ~ n까지 반복; 제곱 복합연산; 합계 / n 출력
            long sum = 0;

            for (int i = 1; i <= n; i++) {
                int score = sc.nextInt();
                sum += score;
            }

            double avg = (double) sum / n;
            System.out.printf("평균: %.2f%n", avg);
        }
    }
}