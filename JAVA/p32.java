import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // n번 반복하여 입력값을 받은 후 누적합 변수에 복합연산
            long sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += sc.nextInt();
            }

            // 최종 합계 출력
            System.out.println("합계: " + sum);
        }
    }
}