import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 1차 패스: 배열 없이 합계만 누적
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += sc.nextInt();
            }

            // 합계와 평균 구하기 (소수점 손실 방지를 위해 double 사용)
            double average = (double) sum / n;

            // 평균 초과 개수 초기화
            int countOverAverage = 0;

            // 2차 패스: 다시 N개 입력받아 평균 초과 카운트
            for (int i = 0; i < n; i++) {
                if (sc.nextInt() > average) {
                    countOverAverage++;
                }
            }

            // 평균 초과 개수 출력
            System.out.println("개수: " + countOverAverage);
        }
    }
}