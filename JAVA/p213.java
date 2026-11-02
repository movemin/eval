import java.util.Scanner;

public class p213 {

    // 자릿수 합 반환 메서드
    public static int digitsSum(int number) {
        // 합계 초기화
        int sum = 0;
        // number가 0보다 클 동안 반복
        while (number > 0) {
            // 나머지값을 누적합
            sum += number % 10;
            // 업데이트
            number /= 10;
        }
        // 자릿수 합 반환
        return sum;
    }

    // 메인 스크립트
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 하샤드 수의 합
            long sum = 0;

            // 1부터 n 이하 반복
            for (int num = 1; num <= n; num++) {

                // 자리수 합 반환
                int ds = digitsSum(num);

                // 모든 하샤드 수의 합 업데이트
                if (ds > 0 && num % ds == 0) {
                    sum += num;
                }
            }

            // 최종 결과값 출력
            System.out.println(sum);
        }
    }
}