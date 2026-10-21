import java.util.Scanner;

public class p201 {

    // 자릿수 합 반환 메서드
    public static long digitsSum(long number) {
        // 합계 초기화
        long sum = 0;
        // number가 0보다 클 동안 반복
        while (number > 0) {
            // 나머지값을 누적합
            sum += number % 10;
            // 업데이트
            number /= 10;
        }
        // 자릿수 합 반환
        return sum;
    }

    // 메인 스크립트
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();
            long total = 0;
            
            // 음수 또는 0 입력 방어 처리
            if (n <= 0) {
                System.out.println(0);
                return;
            }

            for (long num = 1; num <= n; num++) {
                total += digitsSum(num);
            }

            System.out.println(total);
        }
    }
}