import java.util.Scanner;
import java.util.StringJoiner;

public class p249 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            // k가 n 이상일 경우를 대비해 루프 전에 한 번만 처리
            k %= n;

            int[] out = new int[n];
            for (int i = n - 1; i >= 0; i--) {
                out[(i+k)%n] = arr[i];

            }
            // 회전된 순서로 출력
            StringJoiner resultJoiner = new StringJoiner(" ");
            for (int i = 0; i < n; i++) {
                resultJoiner.add(String.valueOf(out[i]));
            }

            System.out.println(resultJoiner);
        }
    }
}