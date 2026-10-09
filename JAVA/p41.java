import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 카운트 변수 초기화
            int count = 0;

            // n번 반복하여 점수 입력받기
            for (int i = 1; i <= n; i++) {
                int score = sc.nextInt();

                // 단일 if문으로 합격자 카운트. 요건 불충족시 무시
                if (score >= 60) {
                    count++;
                }
            }

            // 바깥 for문에서 합격자 수 출력
            System.out.println("합격자 수: " + count);
        }
    }
}