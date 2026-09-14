import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();

            // 뒤집은 수 초기화 및 n 보존값 저장
            long reversed = 0;
            long temp = n;

            // 보존값으로 0이 될때까지 반복
            while (temp > 0) {

                // 10으로 나눈 나머지를 현재 뒤집은 수의 10배를 더하여 저장
                reversed = reversed * 10 + temp % 10;

                // 보존값 업데이트
                temp /= 10;
            }

            // 최종 결과값 출력
            System.out.println("뒤집은 수: " + reversed);
        }
    }
}