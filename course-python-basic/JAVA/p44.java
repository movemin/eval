import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            
            // 홀수의 개수를 채울 변수 초기화
            int oddCount = 0;

            // 1부터 n까지 반복하여 횟수 구현
            for (int i = 1; i <= n; i++) {

                // 홀수인지 심사할 정수 입력받기
                int number = sc.nextInt();

                // 나머지 연산자를 활용하여 2로 나누어 떨어지지 않는다면 카운트
                if (number % 2 != 0) {
                    oddCount++;
                }
            }

            // 홀수 개수 최종 결과값 출력
            System.out.println("홀수 개수: " + oddCount);
        }
    }
}