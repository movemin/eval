import java.util.Scanner;

public class p206 {

    // 직사각수 판정 메서드
    private static boolean rectangularNumber(int n){
        if (n < 0) return false;
        boolean isPronic = false;
        for (int k = 0; ; k++) {
            long p = (long) k * (k + 1);
            if (p == n) {
                isPronic = true;
                break;
            }
            if (p > n) break;
        }
        return isPronic;
    }

    // 메인 스크립트
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println(rectangularNumber(n) ? "직사각수" : "아님");
        }
    }
}