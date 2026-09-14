import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            
            // 합계 초기화
            int sum = 0;
            
            // n의 나머지가 0 이하가 될 때까지 반복
            while (n > 0) {

                // 자릿수 연산 -> 10으로 나눈 나머지
                int reminding = n % 10;

                // 나머지값을 제곱하여 누적합
                sum += reminding * reminding;

                // 업데이트
                n /= 10;
            }

            // 최종값 출력
            System.out.println("제곱합: " + sum);
        }
    }
}