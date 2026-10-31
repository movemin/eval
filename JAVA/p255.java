import java.util.Arrays;
import java.util.Scanner;

public class p255 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            
            // 오름차순 정렬
            Arrays.sort(arr);

            // 홀수: 정중앙 원소, 짝수: 중앙 두 값의 평균
            double median = (n % 2 != 0) ? arr[n / 2] : (arr[n / 2 - 1] + arr[n / 2]) / 2.0;

            System.out.printf("중앙값: %.1f%n", median);
        }
    }
}