import java.util.Scanner;

public class p173 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 부호
            int prevSign = 0;

            // 교차 횟수
            int changes = 0;

            // n번 반복하여 정수 입력받기
            for (int i = 0; i < n; i++) {
                int number = sc.nextInt();

                // 0이면 반복문으로 다시 복귀
                if (number == 0) {
                    continue;
                }

                // 삼항연산자로 양수 음수 구분
                int curSign = number > 0 ? 1 : -1;

                // 부호 교차 카운트
                if (prevSign != 0 && prevSign != curSign) {
                    changes++;
                }
                
                // 부호 업데이트
                prevSign = curSign;
            }

            // 부호 교차 횟수 출력
            System.out.println("교차 횟수: " + changes);
        }
    }
}