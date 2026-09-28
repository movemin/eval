import java.util.Scanner;

public class Main {

    // 소수를 판별하는 메서드
    private static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int divisor = 2; divisor * divisor <= x; divisor++) {
            if (x % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    // 메인으로 실행할 코드
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 효율성을 위해 2부터 n / 2까지 반복
            for (int candidate = 2; candidate <= n / 2; candidate++) {

                // n에서 가장 작은 소수인 candidate를 뺀 값도 소수하면 결과값 출력 후 종료
                if (isPrime(candidate) && isPrime(n - candidate)) {
                    System.out.println(candidate + " + " + (n - candidate));
                    break;
                }
            }
        }
    }
}