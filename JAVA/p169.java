import java.util.Scanner;

// 수학 기능 클래스로 설계
class MathUtils {
    private MathUtils() {} // 유틸리티 클래스는 인스턴스화 방지

    // 피보나치 수열 구현
    public static long fibonacci(int number) {
    long prev = 0;
    long cur = 1;
    long sum = 0;
    for (int i = 1; i <= number; i++) {
        sum += cur;
        long prevValue = cur;
        cur = prev + cur;
        prev = prevValue;
    }
    
    return sum;
    }
}

// 메인 클래스에 피보나치 결과값 출력
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 피보나치 합 결과값 출력
        System.out.println(MathUtils.fibonacci(n));
    }
}