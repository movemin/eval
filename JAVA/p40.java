import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 양수 카운트, 음수 카운트 저장
        int positiveCount = 0;
        int negativeCount = 0;

        // n번 순회하여 정수 입력값 받기
        for (int i = 1; i <= n; i++) {
            int number = sc.nextInt();

            // if-else if문으로 0 일시에는 그냥 무시하는 조건문 작성하여 코드량 줄이기
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            }
        }

        // 양수 카운트, 음수 카운트 출력
        System.out.println("양수: " + positiveCount);
        System.out.println("음수: " + negativeCount);
    }
}