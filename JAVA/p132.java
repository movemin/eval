import java.util.Scanner;

public class Main {

    // 최대 소인수 메서드
    private static long largestPrimeFactor(long number) {
        long last = 0;
        long p = 2;
        while (number > 1) {
            while (number % p == 0) {
                last = p;
                number /= p;
            }
            p++;
        }
        return last;
    }

    // 메인 구문
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();

            // 최대 소인수 메서드 호출하여 결과값 출력
            System.out.println(largestPrimeFactor(n));
        }
    }
}