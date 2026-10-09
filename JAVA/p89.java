import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int DAYS_PER_MONTH = 30;
        try (Scanner sc = new Scanner(System.in)) {
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();

            // 해당 연도 1월 1일부터 며칠째인지 계산
            int dayOfYear = (month - 1) * DAYS_PER_MONTH + day;

            // 일로 환산 결과 출력
            System.out.println(dayOfYear + "일째");
        }
    }
}