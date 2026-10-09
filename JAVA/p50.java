import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 첫 입력을 best의 초기값으로 둔다
            int best = sc.nextInt();

            // n - 1번 순회: 첫 입력을 초기값으로 두었기 때문
            for (int i = 1; i < n; i++) {  // i를 1부터 시작하여 반복값 몇인지 직접 명시하여 가독성 향상
                int candidate = sc.nextInt();
                if (Math.abs(candidate) > Math.abs(best)) {
                    best = candidate;
                }
            }

            // 최종 절댓값이 가장 큰 값 출력
            System.out.println("절댓값 최대의 값: " + best);
        }
    }
}