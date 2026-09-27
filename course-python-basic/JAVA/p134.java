import java.util.Scanner;

public class Main {

    // 소수 구하기 메서드
    static boolean isPrime(int x) {

        // 메개변수가 2 미만이거나 소수가 아닐 경우 조기 리턴
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 카운트 변수 초기화
            int count = 0;
            
            for (int p = 3; p <= n - 2; p++) {

                // 입력값까지의 수열 소수 심사
                if (isPrime(p) && isPrime(p + 2)) {
                    count++;
                }
            }
            
            // 최종 카운트 출력
            System.out.println(count);
        }
    }
}