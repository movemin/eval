import java.util.Scanner;

public class p177 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // 의미 있는 변수명으로 변경: 밑수, 지수, 나머지
            long base = sc.nextLong();
            long exponent = sc.nextLong();
            long modulus = sc.nextLong();

            // 1에서 modulus로 나눈 나머지로 초기화 (modulus=1 엣지케이스 처리)
            long result = 1 % modulus;

            // base를 modulus로 나눈 나머지로 업데이트
            base %= modulus;

            // 이진 거듭제곱(Binary Exponentiation): O(log exponent)
            while (exponent > 0) {
                // exponent가 홀수라면 결과값에 현재 base 반영
                if (exponent % 2 == 1) result = result * base % modulus;

                // base를 제곱하여 다음 비트에 대비
                base = base * base % modulus;

                // exponent를 절반으로 줄임
                exponent /= 2;
            }

            // 결과값 출력
            System.out.println("결과: " + result);
        }
    }
}