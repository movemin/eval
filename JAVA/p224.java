import java.util.Scanner;

public class p224 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            
            // 1단계: 자릿수 계산
            int digit = 0;
            int number = n;
            while (number > 0) {
                number /= 10;
                digit++;
            }

            // 2단계: 자릿수가 1 이하이면 그대로 출력
            if (digit <= 1) {
                System.out.println(n);
            } else {
                // Math.pow 대신 정수 곱셈으로 부동소수점 오류 방지
                int power = 1;
                for (int i = 0; i < digit - 1; i++) {
                    power *= 10;
                }

                // 3단계: 맨 앞 자리 분리 후 맨 뒤로 이동
                int firstDigit = n / power;
                int rest = n % power;
                int result = rest * 10 + firstDigit;
                System.out.println(result);
            }
        }
    }
}