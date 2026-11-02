import java.util.Scanner;

public class p210 {

    // n 번째 카탈란 수 반환 메서드
    private static long catalanNumber(int n) {
        long catalan = 1;
        for (int num = 0; num < n; num++) {
            catalan = catalan * 2 * (2 * num + 1) / (num + 2);
        }
        return catalan;
    }

    // 메인 스크립트: 카탈란 수 메서드를 호출하여 반환값 출력
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println(catalanNumber(n));
        }
    }
}