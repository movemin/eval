import java.util.Scanner;

public class Main {

    // 공백 (spaces)개 + 별 (stars)개를 한 줄에 출력하는 헬퍼 메서드
    private static void printRow(int spaces, int stars) {
        System.out.println(" ".repeat(spaces) + "*".repeat(stars));
    }

    // 메인 스크립트
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            
            // 위쪽 별
            for (int i = 1; i <= n; i++) {
                printRow(n - i, 2 * i - 1);
            }

            // 아래쪽 별
            for (int i = (n - 1); i >= 1; i--) {
                printRow(n - i, 2 * i - 1);
            }
        }
    }
}