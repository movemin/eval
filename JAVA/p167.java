import java.util.Scanner;

// GCD 연산을 담당하는 유틸리티 클래스
class GcdUtil {

    /**
     * 재귀함수 패턴을 활용하여 유클리드 호제법 구현
     * @param a 첫 번째 양의 정수
     * @param b 두 번째 양의 정수
     * @return 두 수의 최대공약수
     */
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}

// 메인 클래스
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();

        // 결과값 출력
        System.out.println("GCD: " + GcdUtil.gcd(firstNum, secondNum));
    }
}