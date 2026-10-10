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

    // main 스크립트
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // n 보존하고 보존값의 진약수 합을 구하여 후보값과 비교 후 출력
        int candidate = n;
        while (true) {
            candidate++;
            int sum = sumOfProperDivisors(candidate);
            if (sum == candidate) {
                System.out.println(candidate);
                break;
            }
        }
    }
}