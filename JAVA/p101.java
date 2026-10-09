import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int prev = Integer.MIN_VALUE;
            int streak = 0;

            // [알고리즘]
            // do 구현문에 정수 입력
            // if-else문으로 조건식을 이전값과 입력값 같은지를 심사
            // 참이면 카운트, 아니면 새로 시작하므로 1로 초기화한 뒤 이전값 현재 입력값으로 선언
            // while문은 스택이 3 미만일 시 반복
            do {
                int number = sc.nextInt();
                if (prev == number) {
                    streak++;
                } else {
                    streak = 1;
                    prev = number;
                }
            } while (streak < 3);

            // 반복문 종료되면 "종료" 출력
            System.out.println("종료");
        }
    }
}