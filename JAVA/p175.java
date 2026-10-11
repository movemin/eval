import java.util.Scanner;

public class p175 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 슬라이딩 윈도우의 첫 두 지역 변수 초기화
            int prev = sc.nextInt();
            int curr = sc.nextInt();

            // 음수만 있는 경우도 대응하기 위해 최솟값으로 초기화
            int best = Integer.MIN_VALUE;

            // i=2부터 n-1까지: 세 번째 요소를 하나씩 읽어 윈도우를 오른쪽으로 이동
            for (int i = 2; i < n; i++) {
                int next = sc.nextInt();

                // 현재 윈도우(prev, curr, next) 합산 후 최댓값 갱신
                int windowSum = prev + curr + next;
                best = Math.max(best, windowSum);

                // 윈도우 한 칸 이동
                prev = curr;
                curr = next;
            }

            System.out.println("최대 3연합: " + best);
        }
    }
}