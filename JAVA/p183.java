import java.util.Scanner;

public class p183 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();

            long left = 1, right = n, ans = -1;

            // 이분 탐색으로 mid * mid == n 인 값을 탐색
            while (left <= right) {

                long mid = (left + right) / 2; 
                long midSquared = (long) mid * mid;

                if (midSquared == n) {
                    ans = mid;
                    break;
                }

                if (midSquared < n) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            // 완전제곱수가 저장된 값이 있으면 출력, 그 외는 '아님' 출력
            if (ans != -1) {
                System.out.println(ans);
            } else {
                System.out.println("아님");
            }
        }
    }
}