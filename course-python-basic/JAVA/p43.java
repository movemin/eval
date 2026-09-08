import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();
            int targetNumber = sc.nextInt();

            // 카운트 변수 초기화 및 값을 계속 바꿀 n 따로 임시 저장
            int count = 0;
            long tempNumber = n;

            // tempNumber가 0이 될 때까지 자릿수 순회
            while (tempNumber != 0) {

                // 나눌 때 나머지가 목표 숫자와 같으면 카운트
                if (tempNumber % 10 == targetNumber) {
                    count++;
                }

                // 실제로 10으로 나눠서 값 업데이트
                tempNumber /= 10;
            }

            // 카운트 최종 결과값 출력
            System.out.println("등장 횟수: " + count);
        }
    }
}