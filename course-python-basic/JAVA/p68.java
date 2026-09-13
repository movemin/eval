import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 자릿수 곱의 값은 급격히 커질 우려가 있으므로 long으로 저장
            long product = 1;

            // n 보존
            int t = n;

            // t를 10으로 나누었을 때 0 이하가 될 때까지 반복
            while (t > 0) {

                // 자릿수 저장
                int digit = t % 10;

                // 자릿수를 자릿수 곱에 곱하기
                product *= digit;

                // t 업데이트
                t /= 10;
            }

            // 최종 결과값 출력
            System.out.println("자릿수 곱: " + product);
        }
    }
}