import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class p258 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);

            // 마지막 공백 처리를 위해 joiner 사용
            StringJoiner result = new StringJoiner(" ");

            // 0부터 k까지 인덱스 순회
            for (int i = 0; i < k; i++) {
                result.add(String.valueOf(arr[i]));
            }

            // 결과값 출력
            System.out.println(result);
        }
    }
}