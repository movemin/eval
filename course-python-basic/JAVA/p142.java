import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 누수 방지
        sc.close();

        // 바깥 i=1..n
        for (int row = 1; row <= n; row++){

            // 행 출력 한번에 처리
            StringBuilder sb = new StringBuilder();

            // 안쪽 j=1..i
            for (int col = 1; col <= row; col++) {
                sb.append(col);
            }

            // 행 출력 후 줄바꿈
            System.out.println(sb);
        }
    }
}