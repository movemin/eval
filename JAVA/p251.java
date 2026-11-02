import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class p251 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            // 오름차순을 순회하여 역순으로 내림차순 출력
            Arrays.sort(arr);

            StringJoiner resultJoin = new StringJoiner(" ");

            for (int i = n - 1; i >= 0; i--) {
                resultJoin.add(String.valueOf(arr[i]));
            }
            
            System.out.println(resultJoin);
        }
    }
}