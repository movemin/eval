import java.util.Scanner;

public class Main {

    // 진약수 합 계산 메서드로 분리 → main 로직 간결화
    static int sumOfProperDivisors(int num) {
        if (num == 1) return 0;
        int sum = 1;
        // √num까지만 탐색해 대칭 약수를 함께 더함 → O(√N)
        for (int j = 2; (long) j * j <= num; j++) {
            if (num % j == 0) {
                sum += j;
                if (j != num / j) sum += num / j;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 진약수 최대수 최대합 초기화
            int bestK = 1;
            int bestSum = 0;
            
            // 1부터 n까지 반복
            for (int num = 1; num <= n; num++) {

                // 진약수 합 메서드 호출하여 저장
                int sum = sumOfProperDivisors(num);

                // 최대수 최대값 갱신
                if (sum > bestSum) {
                    bestK = num;
                    bestSum = sum;
                }
            }

            // 최종 결과값 출력
            System.out.println("수: " + bestK + ", " +  "합: " + bestSum);
        }
    }
}