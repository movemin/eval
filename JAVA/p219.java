import java.util.Scanner;

public class p219 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 이전값을 미리 저장, 연속 구간 횟수와 최대 연속 구간 초기화
            int prev = sc.nextInt();
            int run = 1;
            int best = 1;

            // 이전값 받은 횟수를 뺀 n번 반복하여 정수 입력받기
            for (int i = 1; i < n; i++) {
                int cur = sc.nextInt();

                // 이전값과 현재값을 곱하여 음수가 되면 런 횟수 + 1, best 갱신
                if ((long) prev * cur < 0) {
                    run++;
                    best = run;

                // 아니면 런 초기화
                } else {
                    run = 1;
                }

                // 이전값 업데이트
                prev = cur;
            }

            // 최대 길이 출력
            System.out.println("최대 길이: " + best);
        }
    }
}