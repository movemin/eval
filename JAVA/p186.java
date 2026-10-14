public class p186 {
    
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();

            /** [알고리즘]
            *   자릿수 구하기
            *   자릿수 개수만큼 10을 제곱
            *   n 제곱
            *   자릿수 제곱만큼의 10으로 나눈 값
            *   n 제곱을 자릿수 제곱만큼의 10으로 나눈 나머지를 기준으로 결과값 출력
            */
            long digits = Long.toString(n).length();
            
            // Math.pow 대신 정수 곱셈으로 부동소수점 오차 방지
            long power = 1;
            for (int i = 0; i < digits; i++) {
                power *= 10;
            }

            long square = (long) n * n;
            if (square % power == n) {
                System.out.println("자기동형");
            } else {
                System.out.println("아님");
            }
        }
    }
}