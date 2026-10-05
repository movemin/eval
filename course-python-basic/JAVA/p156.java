import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int target = sc.nextInt();
            int n = sc.nextInt();
            int sum = 0;
            int ignoredNeg = 0;
            boolean hit = false;

            // n번 반복
            for (int i = 0; i < n; i++) {

                // 정수 입력 받기
                int x = sc.nextInt();

                // 정수가 음수이면 밑에 코드를 실행하지 않고 음수 횟수 카운트 뒤 반복문으로 복귀
                if (x < 0) {
                    ignoredNeg++;
                    continue;
                }

                // 양수이면 누적합
                sum += x;

                // 합계가 목표값보가 크면 불린값 변경 뒤 종료
                if (sum >= target) {
                    hit = true;
                    break;
                }
            }
            
            // 달성 여부에 따라 무시된 음수 카운트 또는 양수 합계 출력
            if (hit) {
                System.out.println("달성");
                System.out.println("무시된 음수: " + ignoredNeg);
            } else {
                System.out.println("실패");
                System.out.println("합계: " + sum);
            }
        }
    }
}