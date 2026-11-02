import java.util.Scanner;

public class p188 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();

            // 결과값 초기화
            int result = 0;

            // 0부터 시작하여 s의 길이만큼 반복
            for (int i = 0; i < s.length(); i++) {

                // 인덱스 i자리에 있는 문자 저장
                char c = s.charAt(i);

                // 삼항연산자 활용
                int d = (c >= '0' && c <= '9') ? c - '0' : c - 'A' + 10;
                
                // 결과값 업데이트
                result = result * 16 + d;
            }

            // 최종 결과값 출력
            System.out.println(result);
        }
    }
}