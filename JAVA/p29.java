import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 약수 누적합 변수는 경우에 따라 수가 늘어나므로 long 정수로 선언하여 대비
            long total = 0;

            // 1부터 n까지 순회하여 n에 순회값을 나누어 떨어지는 수가 0일 경우만 누적합
            for (int num = 1; num <= n; num++) {
                if (n % num == 0) {
                    total += num;
                }
            }

            // 최종 누적합 출력
            System.out.println("약수 합: " + total);
        }
    }
}