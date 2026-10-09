import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 이전값, 현재값, 최종 결과값 초기화
            int prevSum = 0, currentSum = 0, result = 0;

            // 1부터 n까지 순회
            for (int num = 1; num <= n; num++) {

                // 현재합계 누적합
                currentSum += num;

                // 현재 합계에서 이전 합계를 뺀 결과값을 최종 결과값에 누적합
                result += (currentSum - prevSum);

                // 이전 합계 업데이트
                prevSum = currentSum;
            }

            // 최종 결과값 출력
            System.out.println("결과: " + result);
        }
    }
}