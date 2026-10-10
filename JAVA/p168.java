import java.util.Scanner;

class MathUtils {
    private MathUtils() {} // 유틸리티 클래스는 인스턴스화 방지

    public static long fibonacci(int number) {

        long prev = 1;
        long cur = 1;

        for (int i = 3; i <= number; i++) {
            long temp = cur;
            cur = prev + cur;
            prev = temp; 
        }

        return cur;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // MathUtils 유틸리티 메서드로 피보나치 결과 출력
        System.out.println(MathUtils.fibonacci(n));
    }
}