import java.util.Scanner;

public class Main {

    // 입력값보다 큰 첫 소수를 구하는 메서드로 따로 분리하여 main구문 가독성 및 유지보수 향상
    private static long smallestPrime(long x) {

        // 최소 소수 초기화
        long candidate = x;

        // return 나올 때까지 반복
        while (true) {

            // 최소 소수 업데이트
            candidate++;

            // 소수 판별 found 변수
            boolean isPrime = true;

            // 2부터 파라미터 제곱근 순회
            for (long i = 2; i * i <= candidate; i++) {

                // 소수일 경우 false 선언
                if (candidate % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // 소수 여부에 따라 리턴
            if (isPrime) {
                return candidate;
            }
        }
    }

    // ---main 구문---
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextInt();

            // N 보다 큰 첫 소수 메서드 호출하여 출력
            System.out.println(smallestPrime(n));
        }
    }
}