import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 현재값과 최대 연속값 초기화
            int current = 0, best = 0;

            // n번 반복하여 정수 입력받기
            for (int i = 0; i < n; i++) {
                int number = sc.nextInt();

                // 홀수이면 연속 변수에 1 누적합, 아니면 연속 변수 초기화
                if (number % 2 != 0) {
                    current++;
                } else {
                    current = 0;
                }

                // 현재 연속값과 최대 연속값 비교
                if (current > best) {
                    best = current;
                }
            }

            // 결과 출력
            System.out.println("최대 홀수 연속: " + best);
        }
    }
}