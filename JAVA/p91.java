import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int mode = sc.nextInt();
            double temp = sc.nextDouble();

            // 모드가 1이면 섭씨 -> 화씨 반환 아니면 역으로 반환
            if (mode == 1) {
                double f = temp * 9 / 5 + 32;
                System.out.printf("%.1f°C = %.1f°F%n", temp, f);
            } else {
                double c = (temp - 32) * 5 / 9;
                System.out.printf("%.1f°F = %.1f°C%n", temp, c);
            }
        }
    }
}