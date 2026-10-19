import java.util.Scanner;

public class p197 {

    // 정수 제곱근 (이분탐색) 메서드
    private static int squareRoot(int n) {
        int lo = 0;
        int hi = n;
        int ans = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if ((long) mid * mid <= n) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    // 메인스크립트
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 정수 제곱근 (이분탐색) 메서드 호출
            System.out.println(squareRoot(n));
        }
    }
}