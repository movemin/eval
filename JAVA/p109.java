import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 실수 타입으로 합계 초기화
        double sum = 0.0;

        // n번 반복
        for (int num = 1; num <= n; num++) {

            // 1을 순회정수로 나눈 값 누적합
            sum += 1.0 / num;
        }

        // 합계 출력
        System.out.printf("합: %.4f%n", sum);
    }
}