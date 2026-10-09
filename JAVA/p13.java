import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 바깥 if : 양수인지. 안쪽 if/else : 짝수/홀수.
        // 바깥 else : "양수 아님".
        if (n > 0) {
            if (n % 2 == 0) {
                System.out.println("양의 짝수");
            } else {
                System.out.println("양의 홀수");
            }
        } else {
            System.out.println("양수 아님");
        }

        // Scanner 자원 명시 해제
        sc.close();
    }
}