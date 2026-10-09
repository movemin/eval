import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int sum = 0, number;

            // [알고리즘]
            // do-while문으로 입력값이 -1일 때까지 반복
            // do문에 정수 입력받기
            // if-else if문으로 0일 경우 합계 초기화, 0과 -1이 아니면 누적합
            // -1이면 반복문 조건문으로 멈추게 설계
            // 최종값 출력
            do {
                number = sc.nextInt();
                if (number == 0) {
                    sum = 0;
                } else if (number != -1) {
                    sum += number;
                }
            } while (number != -1);
            System.out.println("합계: " + sum);
        }
    }
}