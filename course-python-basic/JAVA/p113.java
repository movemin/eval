import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 세제곱의 합계 초기화
            long sum = 0;

            // 1부터 n까지 반복하여 순회변수 3제곱값 누적합
            for (int num = 1; num <= n; num++) {
                sum += (long) num * num * num;
            }

            // 최종 결과값 출력
            System.out.println("세제곱합: " + sum);
        }
    }
}