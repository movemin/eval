import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum = 0, count = 0;

            // 입력값 n번 반복 (0은 카운트 제외)
            while (count < n) {

                // 정수 입력받기
                int number = sc.nextInt();

                // 0이 아니면 누적합 및 카운트 증가 (음수도 유효한 값으로 처리)
                if (number != 0) {
                    sum += number;
                    count++;
                }
            }

            // 누적합 출력
            System.out.println("합계: " + sum);
        }
    }
}