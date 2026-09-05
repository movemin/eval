import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        // while (true) 로 열기
        while (true) {
            int number = sc.nextInt();

            // 조건문으로 정수가 0이면 종료
            if (number == 0) {
                break;
            }

            // 그렇지 않으면 sum += n -> else 쓰지 말고 조건문 밖에 씀으로써 코드 간결화
            sum += number;
        }

        // 종료 후 "합계: <sum>" 출력.
        System.out.println("합계: " + sum);

        // sc 누수 방지
        sc.close();
    }
}