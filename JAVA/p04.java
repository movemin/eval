import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        scanner.close();  // 자원 누수 방지
        // if / else 로 합격/불합격 출력.
        if (score >= 60) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }
    }
}