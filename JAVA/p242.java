import java.util.Arrays;
import java.util.Scanner;

public class p242 {
    private static boolean hasDuplicate(int[] arr) {

        // 오름차순 정렬
        Arrays.sort(arr);

        // 중복 존재 여부 반복문으로 순회하며 확인
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            // "중복: 있음" / "중복: 없음" 출력.
            if (hasDuplicate(arr)) {
                System.out.println("중복: 있음");
            } else {
                System.out.println("중복: 없음");
            }
        }
    }
}