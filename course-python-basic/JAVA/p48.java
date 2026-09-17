import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 최솟값 변수 초기화 -> 음수도 예외처리 가능하게 끔 최대값으로 선언
            int min = Integer.MAX_VALUE;

            // n번 순회하여 정수 입력값 받기
            for (int i = 0; i < n; i++) {

                // 코드를 줄이기 위해 메서드 사용
                min = Math.min(min, sc.nextInt());
            }

            // 최종 최솟값 출력
            System.out.println("최솟값: " + min);
        }
    }
}