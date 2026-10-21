import java.util.Scanner;

public class p203 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // 입력받을 숫자 개수 밑 이전값 미리 저장, 단조, 감소, 최장 길이 초기화
            int n = sc.nextInt();
            int prev = sc.nextInt();
            int incRun = 1;
            int decRun = 1;
            int best = 1;

            // n - 1 만큼 반복
            for (int i = 1; i < n; i++) {
                int cur = sc.nextInt();

                // 현재값이 이전값 보다 크면 단조 증가
                if (cur > prev) {
                    incRun++;
                    decRun = 1;

                // 낮으면 감소 길이 저장
                } else if (cur < prev) {
                    decRun++;
                    incRun = 1;

                // 아니면 1로 초기화
                } else {
                    incRun = 1;
                    decRun = 1;
                }

                // best, 이전값 갱신
                best = Math.max(Math.max(best, incRun), decRun);
                prev = cur;
            }
            
            System.out.println("최장 단조 길이: " + best);
        }
    }
}