import java.util.Scanner;

public class p218 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int target = sc.nextInt();
            
            // b = target - a 로 고정 후 조건 검사
            int pairCount = 0;
            for (int a = 1; a < n; a++) {

                // b를 직접 계산해 이중 루프 제거
                int b = target - a;

                // 1 ≤ a < b ≤ N 조건 확인
                if (b > a && b <= n) {
                    pairCount++;
                }
            }

            System.out.println(pairCount);
        }
    }
}