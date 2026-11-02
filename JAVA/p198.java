import java.util.Scanner;

public class p198 {

    // 콜라츠 단계 수 메서드
    private static int collatzStep(int x) {
        // 현재 단계 및 임시 후보 숫자 저장
        int step = 0;
        int temp = x;
  
        // 1이 될 때까지 반복
        while (temp != 1) {
    
            // 짝수면 절반으로 업데이트
            if (temp % 2 == 0) {
                temp /= 2;

            // 홀수면 3x + 1
            } else {
                temp = (3 * temp) + 1;
            }

            // 단계 카운트
            step++;
        }
        return step;
    }

    // 메인 스크립트
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 콜라츠 단계 수가 가장 큰 수와 그 단계 수
            int bestCandidate = 1;
            int bestSteps = 0;

            // 1부터 n까지 순회
            for (int candidate = 1; candidate <= n; candidate++) {
                
                // 콜라츠 단계 수 메서드 호출
                int curStep = collatzStep(candidate);

                // 콜라츠 단계 수가 가장 큰 수와 그 단계 수 갱신
                if (curStep > bestSteps) {
                    bestSteps = curStep;
                    bestCandidate = candidate;
                }
            }

            // 최종 결과값 출력
            System.out.println("수: " + bestCandidate + ", " +  "단계: " + bestSteps);
        }
    }
}