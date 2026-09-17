import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 1부터 n까지 반복
            for (int number = 1; number <= n; number++) {

                // 홀수일 경우 +와 같이 출력
                if (number % 2 != 0) {
                    System.out.print("+" + number);
                } else {
                    System.out.print("-" + number);  // 짝수일 경우 -와 같이 출력
                }

                // 마지막 값일 경우를 제외하고 뒤에 공백도 같이 출력
                if (number != n) {
                    System.out.print(" ");
                }
            }
        }
    }
}