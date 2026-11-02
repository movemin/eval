import java.util.Scanner;
import java.util.StringJoiner;

public class p247 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            
            // 배열 뒤집기
            for (int i = 0; i < n / 2; i++) {
                swap(arr, i, n - 1 - i);
            }

            // 배열 조인
            StringJoiner sj = new StringJoiner(" ");
            for (int i = 0; i < n; i++) {
                sj.add(String.valueOf(arr[i]));
            }
            
            // 마지막에 공백 없이 배열 출력
            System.out.println(sj);
        }
    }

    // 배열 뒤집는 메서드
    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}