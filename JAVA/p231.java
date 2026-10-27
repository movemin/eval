import java.util.Scanner;

public class p231 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            // 최솟값 변수에 0 인덱스 값을 넣어 반복문과 조건문으로 갱신하여 최솟값 출력
            int min = arr[0];
            for(int i = 1; i < n; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.println("최솟값: " + min);
        }
    }
}