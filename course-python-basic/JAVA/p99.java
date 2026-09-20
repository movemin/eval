import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number;
            int wrongCount = 0;

            // 알고리즘: 정수 입력받고 홀수일 때만 반복, 홀수일 때만 카운트, 결과값 출력
            do {
                number = sc.nextInt();
                if (number % 2 != 0) wrongCount++;
            } while (number % 2 != 0);
            System.out.println("잘못된 입력 횟수: " + wrongCount);
        }
    }
}