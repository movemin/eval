import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 0 외에 정수는 나머지 연산과 나누기 연산을 반복하여 2진수 출력
            if (n == 0) {
                System.out.println("0");
            } else {
                String binary = "";
                while (n > 0) {
                    binary = (n%2) + binary; n /= 2;
                }
                System.out.println(binary);
            }
        }
    }
}