import java.util.Scanner;

public class p246 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            // 최솟값, 최댓값
            int minIdx = 0;
            int maxIdx = 0;

            // 인덱스 순회하여 갱신
            for (int i = 1; i < n; i++) {
                if (arr[i] < arr[minIdx]) minIdx = i;    
                if (arr[i] > arr[maxIdx]) maxIdx = i;
            }

            // 최소 인덱스, 최대 인덱스 출력
            System.out.println("최소 인덱스: " + minIdx);
            System.out.println("최대 인덱스: " + maxIdx);
        }
    }
}