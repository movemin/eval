import java.util.Scanner;

public class p187 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 0이면 0 출력하고 끝
            if (n == 0) {
                System.out.println("0");

            // 0 이외에는 16진수 변환 문자열 계산
            } else {

                // 초기화: StringBuilder로 문자 누적 (불변 String 반복 생성 방지)
                StringBuilder hexBuilder = new StringBuilder();

                // 반복
                while (n > 0) {

                    // 16 나머지 저장
                    int remainder = n % 16;

                    // 삼항연산자로 10을 기준으로 붙일 문자 정하기
                    char hexChar = remainder < 10 ? (char)('0' + remainder) : (char)('A' + remainder - 10);

                    // 뒤에 추가 후 마지막에 reverse (앞에 붙이는 대신 역순 전략)
                    hexBuilder.append(hexChar);

                    // 업데이트
                    n /= 16;
                }

                // 역순으로 뒤집어 최종 결과값 출력
                System.out.println(hexBuilder.reverse().toString());
            }
        }
    }
}