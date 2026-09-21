import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum = 0, count = 0;

            // n번 반복하여 정수 입력받기
            for (int i = 0; i < n; i++) {
                int number = sc.nextInt();

                // 정수가 1 ~ 100의 범위 내이면 누적합, 카운트
                if (1 <= number && number <= 100) {
                    sum += number;
                    count++;
                }
            }

            // 카운트가 0 초과이면 평균을 출력하고, 아니면 "유효값 없음" 출력
            if (count > 0) {
                System.out.printf("평균: %.2f%n", (double) sum / count);
            } else {
                System.out.println("유효값 없음");
            }
        }
    }
}