import java.util.Scanner;

public class p226 {

    // main 스크립트
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (isHappy(n) && isHappy(n + 1)) {
                System.out.println("쌍둥이 해피");
            } else {
                System.out.println("아님");
            }
        }
    }

    // 함수로 분리하여 main 코드 가독성 올리기
    private static int digitsPowSum(int n) {
        int sum = 0;
        // 각 자릿수의 제곱(2승) 합 계산
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10; // 파라미터를 직접 줄여도 원본에 영향 없음
        }
        return sum;
    }

    // 해피 수 판정 메서드로 분리 → main 가독성 향상
    private static boolean isHappy(int n) {
        // 1에 도달하면 해피 수, 4에 도달하면 비해피 수 (사이클 시작점)
        while (n != 1 && n != 4) {
            n = digitsPowSum(n);
        }
        return n == 1;
    }
}