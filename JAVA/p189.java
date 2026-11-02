import java.util.Scanner;

public class p189 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String numStr = sc.next();

            // 바꾸고자 하는 진법 입력받기
            int base = sc.nextInt();

            // 결과값 초기화
            long result = 0;

            // 0부터 시작하여 s의 길이만큼 반복
            for (int i = 0; i < numStr.length(); i++) {

                // 진법 계산
                result = result * base + (numStr.charAt(i)-'0');
            }

            // 최종 결과값 출력
            System.out.println(result);
        }
    }
}