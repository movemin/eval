import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 첫 입력값을 초기값으로 초기화
            int maxNum = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int number = sc.nextInt();

                // 조건문을 활용하여 최댓값 업데이트
                maxNum = Math.max(maxNum, number);
            }

            // 최종 최댓값 출력
            System.out.println("최댓값: " + maxNum);
        }
    }
}