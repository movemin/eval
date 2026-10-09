import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 가장 큰 진약수 초기화 (1은 모든 정수의 약수)
            int result = 1;

            // 문제 요구사항에 따라 1부터 n까지 순회하여 가장 큰 진약수 갱신
            for (int divisor = n / 2; divisor >= 1; divisor--) {
                if (n % divisor == 0) {
                    result = divisor;
                    break;
                }
            }

            // 최종 결과값 출력
            System.out.println("가장 큰 진약수: " + result);
        }
    }
}