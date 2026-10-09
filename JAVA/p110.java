import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 실수 타입으로 합계 초기화 (메모리 아끼기 위해 첫 값 미리 저장)
            double sum = 1.0;

            // n번 반복 (위의 변수에 따라 2부터 시작)
            for (int num = 2; num <= n; num++) {

                // 짝수번째이면 뺄셈, 홀수이면 덧셈
                if (num % 2 == 0) sum -= 1.0 / num;
                else              sum += 1.0 / num;
            }

            // 합계 출력
            System.out.printf("합: %.4f%n", sum);
        }
    }
}