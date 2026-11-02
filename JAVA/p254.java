import java.util.Arrays;
import java.util.Scanner;

public class p254 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // n == 0 방어 처리 (빈 배열 입력 시 즉시 종료)
            if (n == 0) return;

            // 값 오름차순 정렬 후 인접 비교로 빈도 집계 — O(N log N)
            Arrays.sort(arr);

            int count = 1; // 첫 번째 원소를 포함해 1로 시작

            for (int i = 1; i < n; i++) {
                if (arr[i] == arr[i - 1]) {
                    count++;
                } else {
                    System.out.println(arr[i - 1] + ": " + count);
                    count = 1;
                }
            }

            // 마지막 고유값 출력
            System.out.println(arr[n - 1] + ": " + count);
        }
    }
}