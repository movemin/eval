import java.util.Scanner;
import java.util.StringJoiner;

public class p248 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            // 배열 입력
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // K 정규화: K >= N 인 경우를 처리 (루프 밖에서 한 번만 실행)
            k %= n;

            // 회전된 순서로 출력
            StringJoiner resultJoiner = new StringJoiner(" ");
            for (int i = 0; i < n; i++) {
                k %= n;
                resultJoiner.add(String.valueOf(arr[(i + k) % n]));
            }
            System.out.println(resultJoiner);
        }
    }
}