import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // posSum, negAbsSum 누적합 초기화
            int posSum = 0, negAbsSum = 0;

            // n번 순회
            for (int i = 0; i < n; i++) {

                // 정수 입력받기
                int number = sc.nextInt();

                // 양수이면 양수합에 누적합
                if (number > 0) {
                    posSum += number;

                // 음수이면 음수합에 누적합 (절대값을 구해야 하므로 x -1 연산)
                } else if (number < 0) {
                    negAbsSum += number * -1;
                }
            }

            // 각 최종 결과값 출력
            System.out.println("양수 합: " + posSum);
            System.out.println("음수의 절댓값 합: " + negAbsSum);
        }
    }
}