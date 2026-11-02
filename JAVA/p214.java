import java.util.Scanner;

public class p214 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int count = 0;

            // 1부터 순회
            for (int k = 1; ; k++) {

                // 직사각수 계산
                long p = (long) k * (k + 1);

                // 직사각수가 입력값보다 높으면 종료
                if (p > n) {
                    break;
                }

                // 카운트 업데이트
                count++;
            }

            // 최종 카운트 출력
            System.out.println(count);
        }
    }
}