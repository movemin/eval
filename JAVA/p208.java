import java.util.Scanner;

public class p208 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();

            // 사면체수 수학 공식으로 계산
            System.out.println(n * (n + 1) * (n + 2) / 6);
        }
    }
}