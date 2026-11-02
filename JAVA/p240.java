import java.util.Scanner;

public class p240 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int lo = sc.nextInt();
            int hi = sc.nextInt();
            int count = 0;

            // 인덱스 순회
            for (int i = 0; i < n; i++) {

                // 범위 안에 있으면 카운트
                if (arr[i] >= lo && arr[i] <= hi) {
                    count++;
                }
            }

            // 최종 카운트 출력
            System.out.println("개수: " + count);
        }
    }
}