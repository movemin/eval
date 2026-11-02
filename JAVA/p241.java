import java.util.Arrays;
import java.util.Scanner;

public class p241 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            // 오름차순 정렬
            Arrays.sort(arr);

            // 최대값은 오름차순의 배열의 마지막 요소
            int max = arr[n - 1];

            // 내림차순으로 순회하여 두번째로 큰 고유값을 만나면 결과값 출력 후 반환
            for (int i = n - 2; i >= 0; i--){
                if (arr[i] != max) {
                    System.out.println("두 번째: " + arr[i]);
                    return;
                }
            }

            // 반환 없이 반복문을 순회하였다면 '없음' 출력
            System.out.println("두 번째: 없음");
        }
    }
}