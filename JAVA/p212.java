import java.util.Scanner;

public class p212 {
    
    // 직사각수 판정 메서드
    private static long rectangularNumber(int k) {
        return (long) k * (k + 1);
    }

    // 메인 스크립트
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int k = 0; ; k++) {
                // 메서드 호출
                long product = rectangularNumber(k);
                if (product == n) {
                    System.out.println(k);
                    break;
                } else if (product > n) {
                    System.out.println("아님");
                    break;
                }
            }
        }
    }
}