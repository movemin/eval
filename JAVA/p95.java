import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int score = sc.nextInt();

            // 점수의 범위에 따라 학점과 학점 포인트 출력
            if (90 <= score && score <= 100) {
                System.out.printf("%s (%.1f)%n", "A", 4.0);
            } else if (80 <= score && score <=  89) {
                System.out.printf("%s (%.1f)%n", "B", 3.0);
            } else if (70 <= score && score <=  79) {
                System.out.printf("%s (%.1f)%n", "C", 2.0);
            } else if (60 <= score && score <=  69) {
                System.out.printf("%s (%.1f)%n", "D", 1.0);
            } else {
                System.out.printf("%s (%.1f)%n", "F", 0.0);
            }
        }
    }
}