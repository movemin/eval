import java.util.Scanner;
import java.util.StringJoiner;

public class p239 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            
            // n >= 2 일 때만 첫 원소와 마지막 원소를 교환
            if (n >= 2) {
                int firstVal = arr[0];
                arr[0] = arr[n - 1];
                arr[n - 1] = firstVal;
            }

            // 마지막 열 공백 방지
            StringJoiner joiner = new StringJoiner(" ");

            // 인덱스 순회 — 교환 후 배열을 그대로 출력
            for (int i = 0; i < n; i++) {
                joiner.add(String.valueOf(arr[i]));
            }
            
            // 최종 배열 출력
            System.out.println(joiner);
        }
    }
}