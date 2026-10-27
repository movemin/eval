import java.util.Scanner;

public class p232 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            
            // 누적합
            long sum = 0;
            for (int num : arr) {
                sum += num;
            }

            // 평균 계산 후 출력
            double avg = (double) sum / n;
            System.out.printf("평균: %.2f%n", avg);
        }
    }
}