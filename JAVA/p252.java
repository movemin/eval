import java.util.Scanner;
import java.util.StringJoiner;

public class p252 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            // 각 i 에 대해 arr[0..i-1] 에 같은 값이 없으면 출력 (중첩 for)
            StringJoiner resultJoiner = new StringJoiner(" ");

            for (int i = 0; i < n; i++) {
                boolean isDuplicate = false; // 앞에서 이미 등장한 값인지 여부

                for (int j = 0; j < i; j++) { // i 이전 구간만 확인 (입력 순서 유지)
                    if (arr[i] == arr[j]) {
                        isDuplicate = true;
                        break; // 중복 확인되면 즉시 탈출
                    }
                }

                if (!isDuplicate) {
                    resultJoiner.add(String.valueOf(arr[i]));
                }
            }

            System.out.println(resultJoiner);
        }
    }
}