import java.util.Scanner;

public class p228 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) arr[i] = sc.nextInt();

            // 배열 요소를 공백으로 구분하여 역순으로 한 줄 출력
            StringBuilder sb = new StringBuilder();
            for (int idx = size - 1; idx >= 0; idx--) {
                if (idx < size - 1) {
                    sb.append(" ");
                }
                sb.append(arr[idx]);
            }
            System.out.println(sb);
        }
    }
}