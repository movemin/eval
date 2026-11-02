import java.util.Scanner;

public class p253 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            // 고유값 개수 초기화
            int count = 0;
            for (int i = 0; i < n; i++) {
                boolean isDuplicate = false;
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    count++;
                }
            }
            System.out.println("개수: " + count);
        }
    }
}