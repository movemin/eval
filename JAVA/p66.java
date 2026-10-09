import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int firstNum = sc.nextInt();
            int secondNum = sc.nextInt();

            // 입력값들 중 최솟값 저장
            int gcd = findGcd(firstNum, secondNum);

            // 1부터 최솟값까지 순회하여 공약수 출력
            List<String> divisors = new ArrayList<>();
            for (int divisor = 1; divisor <= gcd; divisor++) {
                if (gcd % divisor == 0) {
                    divisors.add(String.valueOf(divisor));
                }
            }

            // 공백 구분 출력 (마지막 공백 없음)
            System.out.println(String.join(" ", divisors));
        }
    }

    // 유클리드 호제법으로 최대공약수 계산
    private static int findGcd(int a, int b) {
        return b == 0 ? a : findGcd(b, a % b);
    }
}