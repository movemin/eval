import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 누수 방지
        sc.close();

        // 약수 누적합 초기화
        int sum = 0;

        // √n 까지만 순회하여 약수 쌍을 동시에 처리 (O(√N) 최적화)
        for (int num = 1; (long) num * num <= n; num++) {

            // 약수면 누적합
            if (n % num == 0) {
                // num 자신은 항상 더함 (단, num == n 이면 자기 자신이므로 제외)
                if (num != n) {
                    sum += num;
                }

                // 쌍 약수(n/num)가 num 과 다르고 n 자신이 아닐 때만 추가
                int pair = n / num;
                if (pair != num && pair != n) {
                    sum += pair;
                }
            }
        }

        // 합계 출력
        System.out.println(sum);
    }
}