import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            
            // 행 순회
            for (int i = 1; i <= n; i++) {
                
                // 열에서 공백 출력
                for (int j = 1; j <= (n - i); j++) {
                    System.out.print(" ");
                }

                // 같은 열 * 출력
                for (int j = 1; j <= ((2 * i) - 1); j++) {
                    System.out.print("*");
                }

                // 줄바꿈
                System.out.println();
            }
        }
    }
}