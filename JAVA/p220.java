import java.util.Scanner;

public class p220 {
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
    // 메인 스크립트
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for (int candidate = 2; candidate <= n; candidate++) {
                int partnerSum = sumOfProperDivisors(candidate);
                if ((candidate < partnerSum && partnerSum <= n) && sumOfProperDivisors(partnerSum) == candidate) {
                    System.out.println(candidate + " " + partnerSum);
                    return;
                }
            }
            System.out.println("없음");
        }
    }
}