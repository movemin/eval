import java.util.Scanner;

public class p243 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int k = sc.nextInt();

            // 카운트
            long count = 0;

            // 인덱스 순회: j는 i+1부터 시작해 i<j 조건을 보장하고 중복 쌍을 방지
            for (int i = 0; i < n; i++) {

                // 바깥 인덱스에서 시작해서 순회
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] + arr[j] == k) {
                        count++;
                    }
                }
            } 

            // 최종 결과값 출력
            System.out.println("쌍: " + count);
        }
    }
}