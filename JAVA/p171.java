import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 첫번째값 저장
            int max = sc.nextInt();

            // 최댓값 이후 구간의 최솟값 초기화
            int minSinceMax = max;

            // 첫번째값을 뺀 횟수만큼 순회
            for (int i = 1; i < n; i++) {

                // 순회하며 정수 입력받기
                int current = sc.nextInt();

                // 정수가 현재 최댓값보다 크면 업데이트
                if (current >= max) {
                    max = current;
                    minSinceMax = current;

                // 정수가 최댓값 이후 구간의 최솟값보다 낮으면 업데이트
                } else if (current < minSinceMax) {
                    minSinceMax = current;
                }
            }

            // 최종 결과 출력
            System.out.println("답: " + minSinceMax);
        }
    }
}