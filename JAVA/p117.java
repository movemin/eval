import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 수학 공식으로 O(1) 계산: 반복문 없이 바로 구함
            int odd = (n + 1) / 2;  // 1~N 중 홀수 개수
            int even = n / 2;       // 1~N 중 짝수 개수

            // 비교연산자와 조건문을 통해 홀수가 더 많을 경우, 짝수가 더 많을 경우, 같을 경우를 나눠서
            // 각각 다른 문자열 출력
            if (odd > even) {
                System.out.println("홀수 더 많음");
            } else if (odd < even) {
                System.out.println("짝수 더 많음");
            } else {
                System.out.println("같음");
            }
        }
    }
}