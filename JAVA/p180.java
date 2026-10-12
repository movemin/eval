import java.util.Scanner;

public class p180 {

    // 함수로 분리하여 main 코드 가독성 올리기
    private static int digitsPowSum(int n) {
        // 합계 변수 초기화
        int sum = 0;

        // 보존값 저장
        int remaining = n;

        // 각 자릿수의 제곱(2승) 합 계산
        while (remaining > 0) {
            int digit = remaining % 10;
            sum += digit * digit;
            remaining /= 10;
        }

        // 자릿수 제곱합 반환
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 1이나 4에 도달하면 종료
            while (n != 1 && n != 4) {
                int sum = digitsPowSum(n);
                n = sum;
            }

            // 해피수 판정 결과 삼항연산자로 출력
            System.out.println(n == 1 ? "해피 수" : "해피 수 아님");
        }
    }
}