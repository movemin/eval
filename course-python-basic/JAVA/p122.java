import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // TODO: evenSum, oddSum 누적. 비교 후 셋 중 하나 출력.
            int evenSum = 0, oddSum = 0;

            // n번 순회하여 정수 입력값을 받음
            for (int i = 0; i < n; i++) {
                int number = sc.nextInt();

                // 입력받은 정수가 짝수이면 짝수 합계 변수, 그 외는 홀수 합계 변수에 누적합
                if (number % 2 == 0) {
                    evenSum += number;
                } else {
                    oddSum += number;
                }
            }

            // 조건문으로 하여금 짝수 합과 홀수 합 비교하여 각각 다른 결과값 출력
            if (evenSum > oddSum) {
                System.out.println("짝수 합이 큼");
            } else if (evenSum < oddSum) {
                System.out.println("홀수 합이 큼");
            } else {
                System.out.println("같음");
            }
        }
    }
}