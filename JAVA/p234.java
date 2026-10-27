import java.util.Scanner;

public class p234 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int targetNum = sc.nextInt();

            // 목표 인덱스값 초기화
            int foundIndex = -1;

            // 인덱스 순회하여 값 찾기
            for (int idx = 0; idx < n; idx++) {
                if (foundIndex == -1 && arr[idx] == targetNum) {
                    foundIndex = idx;
                    break;
                }
            }

            // 해당 인덱스 값 출력
            System.out.println("인덱스: " + foundIndex);
        }
    }
}