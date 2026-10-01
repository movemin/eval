import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 누수 방지
        sc.close();
        
        // 바깥 i=1..n
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();

            // 안쪽 j=1..n
            for (int j = 1; j <= n; j++) {

                // 테두리 (i==1 || i==N || j==1 || j==N) 면 '*', 아니면 ' '.
                if (i == 1 || i == n || j == 1 || j == n) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }

            // 줄 끝 줄바꿈
            System.out.println(sb);
        }
    }
}