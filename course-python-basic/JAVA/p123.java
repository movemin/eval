import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 짝수와 홀수의 개수 카운트 변수 초기화
            int evenCount = 0, oddCount = 0;

            // 자릿수가 다 없어질 때까지 반복
            while (n > 0) {

                // 마지막 자릿수 추출
                int digit = n % 10;

                // 짝수면 짝수의 개수에 카운트, 그 외는 홀수의 개수에 카운트
                if (digit % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }

                // 조건문이 끝나면 자릿수 업데이트
                n /= 10;
            }

            // 최종 결과값 출력
            System.out.println("짝수: " + evenCount + ", " + "홀수: " + oddCount);
        }
    }
}