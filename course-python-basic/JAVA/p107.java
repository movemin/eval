import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int startNum = sc.nextInt();
            int commonDiff = sc.nextInt();
            int n = sc.nextInt();

            // 더할 숫자 첫 항으로 저장, 합계 초기화
            int term = startNum;
            int sum = 0;

            // n번 반복하여 항, 합계 업데이트
            for (int i = 0; i < n; i++) {
                sum += term;
                term += commonDiff;
            }

            // 합계 출력
            System.out.println("합: " + sum);
        }
    }
}