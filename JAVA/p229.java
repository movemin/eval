import java.util.Scanner;

public class p229 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            
            // 합계 초기화
            long sum = 0;

            // 배열 요소 순회하여 누적합
            for (int num : arr) {
                sum += num;
            }

            // 결과값 출력
            System.out.println("합: " + sum);
        }
    }
}