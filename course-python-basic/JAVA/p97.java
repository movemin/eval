import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x;

            // 양수 받을 때까지 반복 입력
            do {
                x = sc.nextInt();
            } while (x <= 0);

            // 양수를 받으면 받은 양수값 출력
            System.out.println("입력값: " + x);
        }
    }
}