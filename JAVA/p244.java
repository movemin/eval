import java.util.Scanner;

public class p244 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            // 최댓값
            int maxDiff = 0; 

            // 인덱스 1부터 n - 1까지 순회
            for (int i = 1; i < n; i++) {

                // 인접한 두 원소의 차이의 절댓값
                int absDiff = Math.abs(arr[i] - arr[i-1]); 
                
                maxDiff = Math.max(maxDiff, absDiff);
            }

            // 최종 결과값 출력
            System.out.println("최대 차이: " + maxDiff);
        }
    }
}