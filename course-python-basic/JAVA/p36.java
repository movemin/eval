import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 수도 코드: 결과값 초기화; 1부터 n까지 반복; 짝수면 뺄셈, 홀수면 덧셈; 결과값 출력
            int result = 0;

            for (int i = 1; i <= n; i++) {
                // i % 2 != 0 으로 홀수 체크 — 가독성을 높이는 대안 표현
                if (i % 2 != 0) {
                    result += i;
                } else {
                    result -= i;
                }
            }

            System.out.println("결과: " + result);
        }
    }
}