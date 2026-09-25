import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 결과값 초기화
            int result = 0;

            // n번 순회하여 입력값 받기
            for (int i = 1; i <= n; i++) {
                int number = sc.nextInt();

                // 홀수 번째이면 더하고, 짝수 번째이면 빼기
                if (i % 2 != 0) {
                    result += number;
                } else {
                    result -= number;
                }
            }

            // 결과값 출력
            System.out.println("결과: " + result);
        }
    }
}