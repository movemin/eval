import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 이전값, 부호 바뀐 횟수 초기화
            int prevSign = 0, change = 0;

            // n번 순회하여 정수 입력받기
            for (int i = 0; i < n; i++) {
                int number = sc.nextInt();

                // 0이면 무시하고 다음으로
                if (number == 0) continue;

                // 양수=1, 음수=-1 로 인코딩
                int curSign = Integer.signum(number);

                // 이전 유효 부호가 존재하고, 부호가 다를 때 변경 횟수 증가
                if (prevSign != 0 && prevSign != curSign) {
                    change++;
                }

                // 이전 부호 업데이트
                prevSign = curSign;  
            }

            // 최종 횟수 출력
            System.out.println("부호 변경: " + change);
        }
    }
}