import java.util.Scanner;
import java.util.StringJoiner;

public class p265 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            // 결과 배열: 자바 기본값이 0이므로 비-0 원소만 앞에 채우면 나머지는 자동으로 0
            int[] out = new int[n];
            int idx = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] != 0) {
                    out[idx++] = arr[i]; // 비-0 원소를 순서대로 앞에 배치
                }
            }

            // 공백 구분 출력 (마지막 원소 뒤 공백 없음)
            StringJoiner result = new StringJoiner(" ");
            for (int v : out) {
                result.add(String.valueOf(v));
            }

            // 최종 결과값 출력
            System.out.println(result);
        }
    }
}