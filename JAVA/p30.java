import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 자릿수 합 변수 초기화
            int sum = 0;

            // 입력값 n 보존을 위한 복사본 n
            int copyN = n;

            // 복사본 n이 0 이하가 될 때까지 반복하여 자릿수 누적합
            while (copyN > 0) {
                sum += copyN % 10; copyN /= 10;
            }

            // 최종 자릿수 합 출력
            System.out.println("자릿수 합: " + sum);
        }
    }
}