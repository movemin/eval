import java.util.Scanner;

public class p230 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // 입력 처리
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            // 최댓값 탐색: 첫 원소를 기준으로 순차 비교
            int maxVal = arr[0]; // max → maxVal: Math.max와 혼동 방지
            for (int i = 1; i < n; i++) {
                if (arr[i] > maxVal) {
                    maxVal = arr[i];
                }
            }

            // 결과 출력
            System.out.println("최댓값: " + maxVal);
        }
    }
}