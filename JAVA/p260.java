import java.util.Scanner;
import java.util.StringJoiner;

public class p260 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            // 빼기 연산자와 인덱스, joiner를 사용하여 인접 차이 배열 출력
            StringJoiner diffJoiner = new StringJoiner(" ");
            for (int i = 1; i < n; i++) {
                diffJoiner.add(String.valueOf(arr[i] - arr[i-1]));
            }

            // 결과값 출력
            System.out.println(diffJoiner);
        }
    }
}