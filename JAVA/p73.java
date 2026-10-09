import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 짝수 개수 초기화
            int count = 0;

            // 계속 10으로 나누었을 때 0 이하가 될 때까지 반복
            while (n > 0) {

                // 자릿수 저장
                int digit = n % 10;

                // 자릿수가 짝수일 경우 카운트
                if (digit % 2 == 0) {
                    count++;
                }

                // 다음 자릿수 카운트를 위해 업데이트
                n /= 10;
            }

            // 최종 짝수 자리 개수 출력
            System.out.println("짝수 자리 개수: " + count);
        }
    }
}