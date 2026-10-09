import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 첫 입력을 best의 초기값으로 둔다
            int best = sc.nextInt();

            // n - 1번 순회: 첫 입력을 초기값으로 두었기 때문
            for (int i = 1; i < n; i++) {
                int candidate = sc.nextInt();

                // 0에 기존 값보다 가까우면 갱신
                if (Math.abs(candidate) < Math.abs(best)) {
                    best = candidate;
                }
            }

            // 0에 가장 가까운 최종 값 출력
            System.out.println("0에 가장 가까운 값: " + best);
        }
    }
}