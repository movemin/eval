import java.util.Scanner;
import java.util.StringJoiner;

public class p259 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            // 누적합 배열 구성
            long[] prefixSum = new long[n];
            prefixSum[0] = arr[0];
            for (int i = 1; i < n; i++) {
                prefixSum[i] = prefixSum[i - 1] + arr[i];
            }

            // 결과 출력
            StringJoiner result = new StringJoiner(" ");
            for (int i = 0; i < n; i++) {
                result.add(String.valueOf(prefixSum[i]));
            }
            System.out.println(result);
        }
    }
}