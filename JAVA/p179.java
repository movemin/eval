import java.util.Scanner;

public class p179 {

    // 함수로 분리하여 메모리 아끼고, main 코드 가독성 올리기
    private static int digitsPowSum(int n) {
        // 합계 변수 초기화
        int sum = 0;

        // 자릿수 구하기
        int digits = Integer.toString(n).length();

        // 보존값 저장
        int remaining = n;

        // 보존값으로 자릿수 업데이트
        while (remaining > 0) {
            sum += Math.pow((remaining % 10), digits);
            remaining /= 10;
        }

        // 자릿수 개수만큼 거듭제곱한 합 반환
        return sum;
    }

    // main 스크립트
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 자릿수 개수만큼 거듭제곱한 합이 n과 같으면 나르시시즘
            if (digitsPowSum(n) == n) {
                System.out.println("나르시시즘");
            } else {
                System.out.println("나르시시즘 아님");
            }
        }
    }
}