import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 누수 방지
        sc.close();

        // 1부터 n까지 순회
        for (int row = 1; row <= n; row++) {

            // 1부터 n까지 순회
            for (int col = 1; col <= n; col++) {

                // 4자리 폭으로 오른쪽 정렬 ixj 출력
                System.out.printf("%4d", row * col);
            }

            // 줄 바꿈
            System.out.println();
        }
    }
}