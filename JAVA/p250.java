import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class p250 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            // 오름차순 정렬
            Arrays.sort(arr);

            // joiner를 통해 공백 간격 출력
            StringJoiner resultJoiner = new StringJoiner(" ");

            // 오름차순으로 joiner에 정렬
            for (int i = 0; i < n; i++) {
                resultJoiner.add(String.valueOf(arr[i]));
            }

            // 결과값 출력
            System.out.println(resultJoiner);
        }
    }
}