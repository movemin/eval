import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int minNum = sc.nextInt();
            int maxNum = sc.nextInt();
            // 카운트 변수 초기화
            int count = 0;

            // n번 반복
            for (int i = 1; i <= n; i++) {

                // 정수 입력받기
                int number = sc.nextInt();

                // 논리연산자로 가독성을 향상시켜 범위 내의 정수이면 카운트
                if (minNum <= number && number <= maxNum) {
                    count++;
                }
            }

            // 최종 카운트 출력
            System.out.println("구간 내 개수: " + count);
        }
    }
}