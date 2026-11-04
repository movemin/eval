import java.util.Scanner;

public class p261 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            // 최장 길이, 현재 길이 초기화
            int bestLen = 1;
            int curLen = 1;

            // 1부터 순회하여 이전값도 추적
            for (int i = 1; i < n; i++) {

                // 전값보다 크면 현재 길이 갱신 및 최장 길이 갱신
                if (arr[i] > arr[i-1]) {
                    curLen++;
                    bestLen = Math.max(bestLen, curLen);
                } else {
                    curLen = 1;
                }
            }

            // 최종 출력
            System.out.println("최장: " + bestLen);
        }
    }
}