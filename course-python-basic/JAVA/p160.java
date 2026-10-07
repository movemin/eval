import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;

        // 2부터 n까지 순회하며 진약수 합이 자신보다 작으면 부족수로 카운트
        for (int candidate = 2; candidate <= n; candidate++) {

            // 모든 정수는 약수로 1을 가짐
            int divisorSum = 1;

            // 2부터 제곱근까지 순회
            for (int divisor = 2; (long) divisor * divisor <= candidate; divisor++) {
                
                // 약수면 누적합
                if (candidate % divisor == 0) {
                    divisorSum += divisor;

                    // 중복 방지
                    if (divisor != candidate / divisor) {
                        divisorSum += candidate / divisor;
                    }
                }
            }

            // 부족수 카운트
            if (divisorSum < candidate) {
                count++;
            }
        }

        // 부족수 개수 출력
        System.out.println(count);
    }
}