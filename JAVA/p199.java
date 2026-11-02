import java.util.Scanner;

// 소수 판정 메서드 및 자릿수 반환 메서드 클래스로 설계
class MathPrimeDigitSum {

    // 유틸리티 클래스이므로 인스턴스 생성 방지
    private MathPrimeDigitSum() {}

    // 소수 판정 메서드
    public static boolean isPrime(int n) {
        if (n < 2) return false; // 2 미만은 소수가 아님

        // √n 까지만 확인하면 충분 (성능 개선)
        for (int divisor = 2; divisor * divisor <= n; divisor++) {

            // 나누어 떨어지면 즉시 false 반환 (불필요한 반복 제거)
            if (n % divisor == 0) {
                return false;
            }
        }
        return true;
    }
    
    // 자릿수 합 반환 메서드
    public static int digitsSum(int number) {
        // 합계 초기화
        int sum = 0;
            
        // number가 0보다 클 동안 반복
        while (number > 0) {

            // 자릿수 연산 -> 10으로 나눈 나머지
            int remainder = number % 10;

            // 나머지값을 누적합
            sum += remainder;

            // 업데이트
            number /= 10;
        }

        // 자릿수 합 반환
        return sum;
    }
}

// 제일 먼저 실행하는 파일
public class p199 {

    // 메인 스크립트
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int c = 1;
            int count = 0;
            int prime = 0;

            // 횟수 세기
            while (count < n) {
                c++;

                // 소수 판정 메서드 호출
                if (MathPrimeDigitSum.isPrime(c)) {
                    count++;
                    prime = c;
                }
            }

            // 자릿수 합 메서드 호출하여 결과값 저장
            int result = MathPrimeDigitSum.digitsSum(prime);

            // 결과값 출력
            System.out.println(result);
        }
    }
}