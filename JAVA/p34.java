import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 합계 변수 -> 제곱 합은 수가 엄청 커질 수 있으므로 long으로 선언
            long sum = 0;

            // 1부터 n까지 반복하여 각 제곱값 누적합
            for (int num = 1; num <= n; num++) {
                sum += num * num;
            }

            // 제곱합 결과값 출력
            System.out.println("제곱합: " + sum);
        }
    }
}