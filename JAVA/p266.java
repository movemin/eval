import java.util.Scanner;

public class p266 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] leftArr = new int[n]; // 의미 있는 변수명 사용
            for (int i = 0; i < n; i++) leftArr[i] = sc.nextInt();
            int m = sc.nextInt();
            int[] rightArr = new int[m];
            for (int i = 0; i < m; i++) rightArr[i] = sc.nextInt();

            int[] merged = new int[n + m];
            int i = 0, j = 0, k = 0;

            // 두 포인터로 작은 쪽을 merged에 순서대로 채움 — O(N+M)
            while (i < n && j < m) {
                if (leftArr[i] <= rightArr[j]) {
                    merged[k++] = leftArr[i++];
                } else {
                    merged[k++] = rightArr[j++];
                }
            }

            // 남은 원소 복사
            while (i < n) merged[k++] = leftArr[i++];
            while (j < m) merged[k++] = rightArr[j++];

            // 공백 구분 출력 (마지막 공백 없이)
            StringBuilder sb = new StringBuilder();
            for (int idx = 0; idx < merged.length; idx++) {
                if (idx > 0) sb.append(' ');
                sb.append(merged[idx]);
            }
            System.out.println(sb);
        }
    }
}