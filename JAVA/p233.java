import java.util.Scanner;

public class p233 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int targetNum = sc.nextInt();

            // 요소를 순회하여 목표값과 같다면 카운트를 센 뒤 최종 카운트 출력
            int matchCount = 0;
            for (int num : arr) {
                if (num == targetNum) {
                    matchCount++;
                }
            }
            System.out.println("개수: " + matchCount);
        }
    }
}