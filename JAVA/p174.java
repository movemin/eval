import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // A의 점수, B의 점수, 승자 상태 (0=미결, 1=A, 2=B)
            int aScore = 0, bScore = 0, winner = 0;

            // break를 만날 때까지 정수 입력받기
            while (true) {
                int number = sc.nextInt();

                // 정수 0 입력하면 종료
                if (number == 0) {
                    break;
                }

                // 양수면 A 점수 카운트
                if (number > 0) {
                    aScore++;
                    if (winner == 0 && aScore == 5) {
                        winner = 1; // A가 먼저 5 도달
                    }
                // 음수이면 B 점수 카운트
                } else {
                    bScore++;
                    if (winner == 0 && bScore == 5) {
                        winner = 2; // B가 먼저 5 도달
                    }
                }
            }

            // winner 변수를 기준으로 출력 — 점수 비교가 아닌 '먼저 도달' 여부 판정
            // int 비교로 안전하게 처리 (문자열 == 비교 위험 방지)
            if (winner == 1) {
                System.out.println("A 먼저 도달");
            } else if (winner == 2) {
                System.out.println("B 먼저 도달");
            } else {
                System.out.println("무승부");
            }
        }
    }
}