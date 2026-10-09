import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 최대값과 두 번째로 큰 값 초기화
            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;  // 두 번째로 큰 값 아직 미확정 (명시적으로 동일 상수 사용)
            
            // n번 순회하여 정수 입력받기
            for (int i = 0; i < n; i++) {
                int current = sc.nextInt();

                // 최댓값 갱신
                if (current > max) {
                    secondMax = max;  // 두 번째로 큰 값 먼저 업데이트 하여 전 최대값 보전
                    max = current;

                // 두 번째로 큰 값 갱신
                } else if (current > secondMax) {
                    secondMax = current;
                }
            }

            // 두 번째로 큰 최종 값 출력
            System.out.println("두 번째로 큰 값: " + secondMax);
        }
    }
}