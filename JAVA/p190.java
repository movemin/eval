import java.util.Scanner;

public class p190 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 임의 진법 입력받기
            int base = sc.nextInt();

            // 0이면 0출력 후 종료
            if (n == 0) {
                System.out.println("0");

            // 0 이외
            } else {

                // 결과값 초기화
                StringBuilder sb = new StringBuilder();

                // n이 0 이하가 될 때까지 반복
                while (n > 0) {

                    // 진법에 따라 결과값 업데이트
                    sb.append(n % base);

                    // n 업데이트
                    n /= base;
                }

                // 최종 결과값 출력
                System.out.println(sb.reverse().toString());
            }
        }
    }
}