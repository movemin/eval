import java.util.Scanner;

public class p264 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            // 역전 쌍의 개수 초기화
            long inversionCount = 0;

            // 인덱스 순회
            for (int i = 0; i < n; i++) {
                // 중첩 인덱스 순회
                for (int j = i + 1; j < n; j++) {

                    // j = i+1 시작으로 i<j 조건이 항상 성립하므로 별도 체크 불필요
                    if (arr[i] > arr[j]) {
                        inversionCount++;
                    }
                }
            }
            
            // 최종 결과값 출력
            System.out.println("역전: " + inversionCount);
        }
    }
}