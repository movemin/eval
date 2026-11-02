import java.util.Scanner;

public class p211 {

    // 자릿수 합 반환 메서드
    public static int digitsSum(int number) {
        // 합계 초기화
        int sum = 0;
        // number가 0보다 클 동안 반복
        while (number > 0) {
            // 나머지값을 누적합
            sum += number % 10;
            // 업데이트
            number /= 10;
        }
        // 자릿수 합 반환
        return sum;
    }

    // 메인 스크립트
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int ds = digitsSum(n);
            if (ds > 0 && n % ds == 0) {
                System.out.println("하샤드");
            } else {
                System.out.println("하샤드 아님");
            }
        }
    }
}