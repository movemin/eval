import java.util.Scanner;

// 메인 클래스
public class p200 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int properSum = MathUtils.sumOfProperDivisors(n);

            // 소수 판별 메서드 호출하여 소수 판정 문자열 출력
            System.out.println("소수? " + (MathUtils.isPrime(n) ? "예" : "아니오"));
            
            // 진약수 합 호출하여 출력
            System.out.println("진약수 합: " + properSum);

            // 진약수 합 호출하여 완전수, 과잉수, 부족수 판정
            String category;
            if (properSum == n) {
                category = "완전수";
            } else if (properSum > n) {
                category = "과잉수";
            } else {
                category = "부족수";
            }
            System.out.println("분류: " + category);

            // 자릿수 합 메서드 호출하여 출력
            System.out.println("자릿수 합: " + MathUtils.digitsSum(n));
        }
    }
}

// 수학 유틸리티 클래스
class MathUtils {

    // 인스턴스 생성 방지
    private MathUtils() {}

    // 소수 판정 메서드
    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int divisor = 2; divisor * divisor <= n; divisor++) {
            if (n % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    // 진약수 합 계산 메서드로 분리 → main 로직 간결화
    public static int sumOfProperDivisors(int num) {
        if (num == 1) return 0;
        int sum = 1;

        // √num까지만 탐색해 대칭 약수를 함께 더함 → O(√N)
        for (int j = 2; (long) j * j <= num; j++) {
            if (num % j == 0) {
                sum += j;
                if (j != num / j) sum += num / j;
            }
        }
        return sum;
    }

    // 자릿수 합 반환 메서드
    public static int digitsSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}