import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();

            // 최댓값, 최솟값 초기화
            int max = 0;
            int min = 9;

            // 나머지를 구할 값을 n을 저장하여 보존
            long remaining = n;

            // 맨 앞자리를 나누었을 때 10 미만이 되어야 한 자리수가 나오기 때문에 10 이상일 때까지 반복
            while (remaining > 0) {

                // 자릿수 산출
                int digit = (int) (remaining % 10);

                // 자릿수 최댓값 갱신
                if (digit > max) {
                    max = digit;
                    }

                // 자릿수 최솟값 갱신
                if (digit < min) {
                    min = digit;
                    }
                
                // 자리수 업데이트
                remaining /= 10;
            }

            // 최종값 출력
            System.out.println("범위: " + (max - min));
        }
    }
}