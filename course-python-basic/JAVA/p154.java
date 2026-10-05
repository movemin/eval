import java.util.Scanner;

public class Main {

    // 재사용성을 고려하여 메서드로 분리
    private static boolean isOdd(int integer) {
        return integer % 2 != 0;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int streak = 0, attempts = 0;
            boolean hit = false;
            
            // 홀수 연속 k회 달성 여부 구현문
            for (int i = 1; i <= n; i++) {
                attempts++;
                int x = sc.nextInt();

                // 홀수 짝수 판정
                if (isOdd(x)) {
                    streak++;
                } else {
                    streak = 0;
                }

                // k 달성 시 종료
                if (streak >= k) {
                    hit = true;
                    break;
                }
            }

            // 달성 여부에 따라 결과값 출력
            if (hit) {
                System.out.println("달성 (" + attempts + "회)");
            } else {
                System.out.println("실패");
            }
        }
    }
}