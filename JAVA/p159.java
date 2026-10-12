import java.util.Scanner;

public class p159 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int count = 0;

            // 2부터 n까지 순회하며 진약수 합이 자신보다 크면 과잉수로 카운트
            for (int candidate = 2; candidate <= n; candidate++) {

                // 모든 정수는 약수로 1을 가짐
                int divisorSum = 1;

                // 2부터 제곱근까지 순회
                for (int num = 2; (long) num * num <= candidate; num++) {
                    
                    // 약수면 누적합
                    if (candidate % num == 0) {
                        divisorSum += num;

                        // 중복 방지
                        if (num != candidate / num) {
                            divisorSum += candidate / num;
                        }
                    }
                }

                // 과잉수 카운트
                if (divisorSum > candidate) {
                    count++;
                }
            }

            // 과잉수 개수 출력
            System.out.println(count);
        }
    }
}