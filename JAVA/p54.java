import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 최댓값 초기화 (자릿수는 0~9 범위이므로 0으로 초기화)
            int maxDigit = Integer.MIN_VALUE;

            // while문으로 10으로 나눴을 때 0이 될 때까지 입력값 순회
            while (n > 0) {
                int digit = n % 10;

                // 최댓값 갱신
                maxDigit = Math.max(maxDigit, digit);

                // 자릿수 갱신
                n /= 10;
            }

            // 자릿수 최댓값 최종 결과값 출력
            System.out.println("자릿수 최댓값: " + maxDigit);
        }
    }
}