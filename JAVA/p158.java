import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // 완전수 목록을 StringBuilder로 누적 (후행 공백 제거를 위해)
        StringBuilder result = new StringBuilder();

        for (int candidate = 2; candidate <= n; candidate++) {
            
            // 1은 모든 수의 진약수이므로 미리 포함
            int divisorSum = 1;

            // √candidate 까지만 탐색해 효율 개선 (O(N√N))
            for (int i = 2; (long) i * i <= candidate; i++) {
                if (candidate % i == 0) {
                    divisorSum += i;

                    // 중복 방지
                    if (i != candidate / i) {
                        divisorSum += candidate / i;
                    }
                }
            }

            if (divisorSum == candidate) {

                // 숫자 사이에만 공백
                if (result.length() > 0) result.append(" ");
                result.append(candidate);
            }
        }

        // 후행 공백 없이 출력
        System.out.println(result.toString());
    }
}