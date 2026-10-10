import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 변수 초기화
            int prev = sc.nextInt();
            int runLength = 1;
            int best = 1;

            // 1부터 n-1까지 순회하여 현재 값 입력받기
            for (int i = 1; i <= n - 1; i++) {
                int cur = sc.nextInt();

                // 갱신: cur > prev이면 현재 구간 길이 증가, 아니면 초기화
                if (cur > prev) {
                    runLength++;
                    best = Math.max(best, runLength); // 원소 값이 아닌 구간 길이로 best 갱신
                } else {
                    runLength = 1;
                }

                // 업데이트
                prev = cur;
            }

            // 결과값 출력
            System.out.println("최대 증가 길이: " + best);
        }
    }
}