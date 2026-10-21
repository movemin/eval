import java.util.Scanner;

public class p204 {

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

    // 메인: 하샤드 수 개수
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 자릿수 합 메서드를 호출하여 각 순회 정수를 매개변수로 하여 자기 자신으로 나누어 떨어지는 수이면 카운트
            int count = 0;
            for (int num = 1; num <= n; num++) {
                int ds = digitsSum(num);
                if (ds > 0 && num % ds == 0) count++;
            }
            System.out.println(count);
        }
    }
}