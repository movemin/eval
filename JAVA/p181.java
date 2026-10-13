import java.util.Scanner;

// 수학이라는 관심사로 자릿수 합 묶기
class DigitUtil {

    // 유틸리티 클래스는 인스턴스화 불필요 — private 생성자로 명시
    private DigitUtil() {}

    // 자릿수 합 메서드
    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

// main 스크립트
public class p181 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // n이 한 자리가 될 때까지 반복해서 자릿수 합 구하기
            while (n >= 10) {
                n = DigitUtil.digitSum(n);
            }
            
            // 최종 결과값 출력
            System.out.println(n);
        }
    }
}