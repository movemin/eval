import java.util.Scanner;

public class p223 {
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
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int target = sc.nextInt();
            
            // 콜라츠 단계 수 메서드를 호출하여 타겟값과 같다면 순회값 출력 후 종료
            for (int num = 1; ; num++) {
                if (collatzStep(num) == target) {
                    System.out.println(num);
                    break;
                }
            }
        }
    }
}