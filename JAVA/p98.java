import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double inputValue;

            // 0.0보다 작서나 1.0보다 크면 반복
            do {
                inputValue = sc.nextDouble();
            } while (0.0 > inputValue || inputValue > 1.0);

            // 최종 결과값 출력
            System.out.println("입력값: " + inputValue);
        }
    }
}