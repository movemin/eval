import java.util.Scanner;

public class p217 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int curr = 0;
            int best = 0;
            while (n > 0) {

                // 0과 1중 하나 판정하여 2진수 표현
                int bit = n % 2;

                // 1이면 현재 길이 갱신 및 최대값 업데이트
                if (bit == 1) {
                    curr++;
                    best = Math.max(best, curr);

                // 0이면 초기화
                } else {
                    curr = 0;
                }

                // 대상값 업데이트
                n /= 2;
            }

            // 최종 결과값 출력
            System.out.println(best);
        }
    }
}