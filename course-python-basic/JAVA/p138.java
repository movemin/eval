import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int lineCount = sc.nextInt();

            // 행을 내림차순으로 반복하여 각 행만큼 *을 출력
            for (int i = lineCount; i >= 1; i--) {
                System.out.println("*".repeat(i));
            }
        }
    }
}