import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 스캐너 누수 방지
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 전의 값은 첫 입력값으로 초기화
            long prev = sc.nextLong();

            // 인접 두 값의 최대 곱 초기화
            long maxMultiple = Long.MIN_VALUE;

            // 입력한 n만큼 반복하여 정수 입력
            for (int i = 1; i < n; i++) {
                long cur = sc.nextLong();

                // 인접 두 값의 곱
                long adjacentProduct = prev * cur;
                
                // 인접 두 값의 곱이 이전 최대 곱보다 높으면 업데이트
                maxMultiple = Math.max(maxMultiple, adjacentProduct);

                // 이전값 갱신
                prev = cur;
            }

            // 최종 최대 곱 출력
            System.out.println("연속 두 값의 최대 곱: " + maxMultiple);
        }
    }
}