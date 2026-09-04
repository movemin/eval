import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber;
        int sum = 0;

        // 입력값 최소 한번은 받도록 do-while문 작성
        do {
            inputNumber = sc.nextInt();  // 0이 나올 때까지 반복
            sum += inputNumber;          // 0을 더해도 합계에 영향 없으므로 조건 전에 누적
        } while (inputNumber != 0);

        // 반복문, 출력문 구분
        System.out.println("합계: " + sum);
        sc.close();  // sc 누수 방지
    }
}