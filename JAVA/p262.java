import java.util.Scanner;

public class p262 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            long cur = arr[0]; long best = arr[0];

            // 1부터 순회하여 이전값도 순회할 수 있도록 설계
            for (int i = 1; i < n; i++) {

                // 현재 부분합
                cur = Math.max(arr[i], cur+arr[i]);

                // 최대 부분합
                best = Math.max(best, cur);
            }

            // 최종 결과값
            System.out.println("최대 부분합: " + best);
        }
    }
}