import java.util.Scanner;
import java.util.StringJoiner;

public class p236 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            long sum = 0;  // 오버플로우 방지
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            double avg = (double) sum / n;

            StringJoiner sj = new StringJoiner(" ");
            
            // 평균보다 엄격히 큰 값을 입력 순서대로 수집
            for (int i = 0; i < n; i++) {
                if (arr[i] > avg) {
                    sj.add(arr[i]+"");
                }
            }

            System.out.println(sj.toString());
        }
    }
}