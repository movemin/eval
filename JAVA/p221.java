import java.util.Scanner;

public class p221 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            
            int count = 0;
            for (int k = 2; k <= n; k++) {
                if (isPrime(k) && isHappy(k)) {
                    count++;
                }  
            }
            
            System.out.println(count);
        }
    }

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

    // 함수로 분리하여 main 코드 가독성 올리기
    private static int digitsPowSum(int n) {
        int sum = 0;
        // 각 자릿수의 제곱(2승) 합 계산
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10; // 파라미터를 직접 줄여도 원본에 영향 없음
        }
        return sum;
    }

    // 해피 수 판정 메서드로 분리 → main 가독성 향상
    private static boolean isHappy(int n) {
        // 1에 도달하면 해피 수, 4에 도달하면 비해피 수 (사이클 시작점)
        while (n != 1 && n != 4) {
            n = digitsPowSum(n);
        }
        return n == 1;
    }
}