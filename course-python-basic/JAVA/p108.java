import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int startNum = sc.nextInt();
            int commonRate = sc.nextInt();
            int termCount = sc.nextInt();

            // 더할 항을 첫 항으로 초기화 및 합계 초기화
            long term = startNum;
            long sum = 0;

            // n번 반복하여 항, 합계 업데이트
            for (int i = 0; i < termCount; i++) {
                sum += term;
                term *= commonRate;
            }

            // 최종 합계 출력
            System.out.println("합: " + sum);
        }
    }
}