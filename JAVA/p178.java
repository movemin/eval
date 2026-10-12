import java.util.Scanner;

public class p178 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 대상값 보호
            int temp = n;

            // 숫자를 뒤집을 변수 초기화
            int rev = 0;

            // 대상값이 0 이하가 될 때까지 반복
            while (temp > 0) {

                // 기존 숫자를 앞으로 밀고 대상값의 끝 숫자가 뒤로 오도록 반복
                rev = rev * 10 + temp % 10;

                // 대상값 업데이트
                temp /= 10;
            }

            // 기존값과 뒤집은 값이 같다면 '회문', 아니면 '회문 아님' 출력
            if (n == rev) {
                System.out.println("회문");
            } else {
                System.out.println("회문 아님");
            }
        }
    }
}