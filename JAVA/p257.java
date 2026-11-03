import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class p257 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);

            // 마지막 열 공백 방지를 위해 joiner 호출
            StringJoiner result = new StringJoiner(" ");

            // 오름차순 인덱스를 순회하여 n에서 빼는 방식으로 내림차순 구현
            for (int i = 0; i < k; i++) {
                result.add(String.valueOf(arr[n - 1 - i]));
            }

            // 최종 결과값 출력
            System.out.println(result);
        }
    }
}