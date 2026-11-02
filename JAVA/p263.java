import java.util.Arrays;
import java.util.Scanner;

public class p263 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            
            // 오름차순 정렬 후 최솟값 갱신
            Arrays.sort(arr);
            int minDiff = arr[1] - arr[0];
            for (int idx = 2; idx < n; idx++) {
                minDiff = Math.min(minDiff, arr[idx] - arr[idx - 1]);
            }

            System.out.println("최소 차이: " + minDiff);
        }
    }
}