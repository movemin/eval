import java.util.Scanner;
import java.util.StringJoiner;

public class p237 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            // 마지막 출력 공백 방지
            StringJoiner sj = new StringJoiner(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sj.add(String.valueOf(arr[i] * 2));
            }

            // 최종 결과값 출력
            System.out.println(sj);
        }
    }
}