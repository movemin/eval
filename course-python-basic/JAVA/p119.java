import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 홀수의 곱 초기화
            long product = 1;

            // 1부터 n까지 순회하여 2스탭씩 순회하여 cpu를 아껴 누적곱
            for (int num = 1; num <= n; num += 2) {
                product *= num;
            }

            // 최종 홀수 곱 출력
            System.out.println("홀수 곱: " + product);
        }
    }
}