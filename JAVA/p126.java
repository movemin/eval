import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // [수도코드] prev = 첫 입력. boolean alternating = true.
            //           for (i=1..N-1) { cur 입력; prev*cur >= 0 이면 alternating = false; prev = cur; }
            //           (break 없이 끝까지 순회)
            //           "교대" / "교대 아님" 출력.

            // 이전값 미리 저장 및 플래그 변수 선언
            int prev = sc.nextInt();
            boolean alternating = true;

            // 이전값을 저장했으므로 n - 1번 순회하여 정수 입력받기
            for (int i = 1; i < n; i++) {
                int cur = sc.nextInt();

                // 양수이면 플래그 변수 false 선언
                if (prev * cur >= 0) {
                    alternating = false;
                }

                // 이전값 업데이트
                prev = cur;
            }

            // 인접한 두 수의 곱이 0 이상(같은 부호)이면 교대 아님  ← 주석을 조건에 맞게 수정
            if (alternating) {
                System.out.println("교대");
            } else {
                System.out.println("교대 아님");
            }
        }
    }
}