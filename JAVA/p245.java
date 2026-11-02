import java.util.Scanner;

public class p245 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            boolean isSorted = true;

            // 순회 중 하나라도 내림차순 정렬 되있으면 오름차순 여부 false로 저장
            for (int i = 1; i < n; i++) {
                if (arr[i] < arr[i-1]) {
                    isSorted = false;
                    break;
                }
            }

            // 삼항연산자로 판정
            System.out.println(isSorted ? "판정: 정렬됨" : "판정: 정렬 안 됨");
        }
    }
}