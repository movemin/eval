import java.util.Scanner;
import java.util.StringJoiner;

public class p238 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int k = sc.nextInt();

            // 마지막 공백 방지
            StringJoiner joiner = new StringJoiner(" ");

            // 인덱스 순회하여 요소에 k 더하기
            for (int i = 0; i < n; i++) {
                joiner.add(String.valueOf(arr[i] + k));
            }

            // 최종 결과값 출력
            System.out.println(joiner);
        }
    }
}