import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 합계 누적변수 초기화
            long sum = 0;

            // n번 반복하여 입력값을 받기
            for (int i = 0; i <= n; i++) {
                int num = sc.nextInt();

                // 양수일 경우 누적합
                if (num > 0) {
                    sum += num;
                }
            }

            // 최종 합계 출력
            System.out.println("양수 합: " + sum);
        }
    }
}