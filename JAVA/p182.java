import java.util.Scanner;

public class p182 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();

            // 거듭제곱할 값 초기화
            long p = 1;

            // break를 만날 때까지 반복
            while (true) {

                // 거듭제곱한 결과가 입력값과 같으면 거듭제곱 긍정 판정
                if (p == n) {
                    System.out.println("2의 거듭제곱");
                    break;
                }

                // 거듭제곱한 결과가 입력값을 초과하면 거듭제곱 부정 판정
                if (p > n) {
                    System.out.println("2의 거듭제곱 아님");
                    break;
                }

                // 2 반복하여 거듭제곱
                p *= 2;
            }
        }
    }
}