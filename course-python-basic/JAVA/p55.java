import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 양수 음수를 대비하여 최댓값, 최솟값 초기화
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            // n번 반복하여 정수 입력 뒤 최댓값, 최솟값 갱신
            for (int i = 0; i < n; i++) {
                int number = sc.nextInt();
                max = Math.max(max, number);
                min = Math.min(min, number);
            }

            // 최댓값과 최솟값 차이 출력
            System.out.println("차이: " + (max - min));
        }
    }
}